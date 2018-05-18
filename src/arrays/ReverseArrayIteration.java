package arrays;

import java.io.*;
import java.util.*;

/**
 * Problem statement
 *
 *
 *
 */

public class ReverseArrayIteration {

    /*
     * Complete the reverseArray function below.
     */
    static int[] reverseArray(int[] a) {
        if (a != null) {
            int arrLen = a.length;
            int[] output = new int[arrLen];
            int j = 0;
            for (int i = arrLen - 1; i >= 0; i--) {
                output[j] = a[i];
                j++;
            }
            return output;
        }
        return null;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int arrCount = Integer.parseInt(scanner.nextLine().trim());

        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");

        for (int arrItr = 0; arrItr < arrCount; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        int[] res = reverseArray(arr);

        for (int resItr = 0; resItr < res.length; resItr++) {
            bufferedWriter.write(String.valueOf(res[resItr]));

            if (resItr != res.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}

