package arrays;


/**
 * Problem Statment
 * <p>
 * <p>
 * Context
 * Given a  2D Array, :
 * <p>
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:
 * <p>
 * a b c
 * d
 * e f g
 * There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values.
 * <p>
 * Task
 * Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.
 * <p>
 * Note: If you have already solved the Java domain's Java 2D Array challenge, you may wish to skip this challenge.
 * <p>
 * Input Format
 * <p>
 * There are  lines of input, where each line contains  space-separated integers describing 2D Array ; every value in  will be in the inclusive range of  to .
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * Print the largest (maximum) hourglass sum found in .
 * <p>
 * Sample Input
 * <p>
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 * Sample Output
 * <p>
 * 19
 * Explanation
 * <p>
 * contains the following hourglasses:
 * <p>
 * 1 1 1   1 1 0   1 0 0   0 0 0
 * 1       0       0       0
 * 1 1 1   1 1 0   1 0 0   0 0 0
 * <p>
 * 0 1 0   1 0 0   0 0 0   0 0 0
 * 1       1       0       0
 * 0 0 2   0 2 4   2 4 4   4 4 0
 * <p>
 * 1 1 1   1 1 0   1 0 0   0 0 0
 * 0       2       4       4
 * 0 0 0   0 0 2   0 2 0   2 0 0
 * <p>
 * 0 0 2   0 2 4   2 4 4   4 4 0
 * 0       0       2       0
 * 0 0 1   0 1 2   1 2 4   2 4 0
 * The hourglass with the maximum sum () is:
 * <p>
 * 2 4 4
 * 2
 * 1 2 4
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class HourglassSum {

    // Complete the array2D function below.
    static int array2D(int[][] arr) {
        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = array2D(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

