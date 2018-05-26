package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static List<Integer> maxset(List<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) < 0) {
                temp.add(null);
            } else {
                temp.add(A.get(i));
            }
        }

        for (int i =0; i < temp.size(); i++) {

        }

        return result;
    }

    private int calcSum(int startIndex, int endIndex, List<Integer> array) {
        int sum = 0;
        for (int i = startIndex; i < endIndex; i++) {
            sum = sum + array.get(i);
        }
        return sum;
    }

    static class Entry {
        int startIndex;
        int endIndex;
    }

    public static void main(String args[]) {
        int[] a = {1, 2, 5, -7, 2, 3, -6, 12, 15};
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> result = maxset(list);
        System.out.println(result);
    }
}
