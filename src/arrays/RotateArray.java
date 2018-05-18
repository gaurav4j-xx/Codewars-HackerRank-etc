package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RotateArray {
    public static List<Integer> rotateArray(List<Integer> A, int B) {
        List<Integer> ret = new ArrayList<Integer>();
        int startIndex;
        if (B > A.size()) {
            B = B % A.size();
            //B = A.size() - 1;
        }

        for (startIndex = B; startIndex < A.size(); startIndex++) {
            ret.add(A.get(startIndex));
        }

        if (startIndex == A.size()) {
            for (int i =0; i < B; i++) {
                ret.add(A.get(i));
            }
        }

        return ret;
    }

    public static void main(String args[]) {
        int[] a = {28, 68, 100, 90, 46, 58, 54, 74};
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> result = rotateArray(list, 78);
        System.out.println(result);
    }
}

