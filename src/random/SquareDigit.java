package random;

import java.util.ArrayList;
import java.util.List;

public class SquareDigit {
    public static void main(String args[]) {
        int result = squareDigits(9119);

        if (result == 811181) {
            System.out.println("Perfect");
        } else {
            System.out.println("uh Oh!!!");
        }
    }

    public static int squareDigits(int n) {
        char[] numberString = String.valueOf(n).toCharArray();

        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < numberString.length; i++) {
            int value = Integer.parseInt(String.valueOf(numberString[i]));
            resultList.add(i, value * value);
        }

        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < resultList.size(); k++) {
            sb.append(resultList.get(k));
        }

        return Integer.parseInt(sb.toString());
    }
}
