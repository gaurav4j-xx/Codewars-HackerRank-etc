package arrays;

import java.util.Arrays;

/**
 * Problem Statement
 *
 * Print concentric rectangular pattern in a 2d matrix.
 Let us show you some examples to clarify what we mean.

 Example 1:

 Input: A = 4.
 Output:

 4 4 4 4 4 4 4
 4 3 3 3 3 3 4
 4 3 2 2 2 3 4
 4 3 2 1 2 3 4
 4 3 2 2 2 3 4
 4 3 3 3 3 3 4
 4 4 4 4 4 4 4
 Example 2:

 Input: A = 3.
 Output:

 3 3 3 3 3
 3 2 2 2 3
 3 2 1 2 3
 3 2 2 2 3
 3 3 3 3 3
 
 */

public class PrettyPrint2DArray {
    public static void main(String args[]) {
        Solution solution = new Solution();
        int[][] result = solution.prettyPrint(5);
        System.out.println(Arrays.deepToString(result));
    }
}

class Solution {

    protected int[][] prettyPrint(int N) {
        boolean onePrinted = false;
        int m = N * 2 - 1;
        int[][] arr = new int[m][m];

        int startIndex = 0;
        int endIndex = m - 1;
        int numToFill = N;

        while (!onePrinted) {
            if (startIndex == endIndex) {
                onePrinted = true;
            }
            fillRectangle(arr, startIndex, endIndex, numToFill);
            startIndex++;
            endIndex--;
            numToFill--;
        }
        return arr;
    }

    void fillRectangle(int[][] arr, int startIndex, int endIndex, int numberToFill) {
        fillRight(arr, startIndex, endIndex, numberToFill);
        fillDown(arr, startIndex, endIndex, numberToFill);
        fillLeft(arr, startIndex, endIndex, numberToFill);
        fillUp(arr, startIndex, endIndex, numberToFill);
    }

    void fillRight(int[][] arr, int startIndex, int endIndex, int numberToFill) {
        for (int i = startIndex, j = startIndex; j <= endIndex; j++) {
            arr[i][j] = numberToFill;
        }
    }

    void fillDown(int[][] arr, int startIndex, int endIndex, int numberToFill) {
        for (int i = startIndex, j = endIndex; i <= endIndex; i++) {
            arr[i][j] = numberToFill;
        }
    }

    void fillLeft(int[][] arr, int startIndex, int endIndex, int numberToFill) {
        for (int i = endIndex, j = endIndex; j >= startIndex; j--) {
            arr[i][j] = numberToFill;
        }
    }

    void fillUp(int[][] arr, int startIndex, int endIndex, int numberToFill) {
        for (int i = endIndex, j = startIndex; i >= startIndex; i--) {
            arr[i][j] = numberToFill;
        }
    }
}