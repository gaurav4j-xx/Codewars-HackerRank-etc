package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * Solution to find maximum continous sub array in an
 * arrays seperated by negative numbers.
 *
 * For ex.
 * Input - [1,2,3,-1,4,5,-2,6,7,8]
 * Output - [6,7,8]
 *
 */
public class MaxSubArray {
    public static List<Integer> maxset(List<Integer> A) {

        List<List<Integer>> listOfLists = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) >= 0) {
                tempList.add(A.get(i));
            } else {
                listOfLists.add(tempList);
                tempList = new ArrayList<>();
            }
            if (i == A.size() - 1) {
                listOfLists.add(tempList);
            }
        }
        Map<Long, List<Integer>> mapResult = listOfLists.stream()
                .collect(Collectors.toMap(list -> list.stream().mapToLong(i -> i).sum(),
                        Function.identity(), (e1, e2) -> e1, TreeMap::new));

        return mapResult.get(mapResult.keySet().stream().sorted().max(Comparator.naturalOrder()).get());
    }

    public static void main(String args[]) {
        //int[] a = {1, 2, 5, -7, 2, 3, -6, 12, 15};
        int[] a = {1967513926, 1540383426, -1303455736, -521595368};
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> result = maxset(list);
        System.out.println(result);
    }
}
