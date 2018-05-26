package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Write a function that accepts an array of 10 integers (between 0 and 9),
 * that returns a string of those numbers in the form of a phone number.
 * <p>
 * createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
 */
public class CreatePhoneNumber {
    public static void main(String args[]) {
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        System.out.println(createPhoneNumberConcise(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public static String createPhoneNumberConcise(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());
    }

    public static String createPhoneNumber(int[] numbers) {
        String num = Arrays.toString(numbers);
        String temp = num.substring(1, num.length() - 1).replaceAll(",", "").replaceAll(" ", "");
        if (temp.length() == 10) {
            String areaCode = formatAreaCode(temp.substring(0, 3));
            return areaCode + temp.substring(3, 6) + "-" + temp.substring(6);
        } else {
            return "Input number sequence is not valid, please check and re-enter";
        }
    }

    private static String formatAreaCode(String areaCode) {
        return "(" + areaCode + ") ";
    }

}
