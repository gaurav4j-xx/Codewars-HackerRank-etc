package arrays;

import java.util.Comparator;
import java.util.stream.IntStream;

public class MinMax {
    public static void main(String args[]) {
        System.out.println(prettyPrint(minMax(new int[]{1,2,3,4,5})));
        System.out.println(prettyPrint(minMax(new int[]{2334454,5})));
        System.out.println(prettyPrint(minMax(new int[]{1})));

    }
    public static int[] minMax(int[] arr) {
        int[] result = new int[2];
        result[0] = IntStream.of(arr).boxed().min((Comparator.naturalOrder())).get().intValue();
        result[1] = IntStream.of(arr).boxed().max((Comparator.naturalOrder())).get().intValue();
        return result;
    }

    private static String prettyPrint(int arr[]) {
        StringBuilder temp = new StringBuilder(arr.length);
        for(int i=0; i < arr.length; i++) {
            temp.append(arr[i]);
            temp.append(",");
        }
        return temp.substring(0, temp.length() - 1);
    }
}
