package strings;

/**
 * #Input
 * A word (string) of length 0 < str < 1000
 *
 * #Output
 * The middle character(s) of the word represented as a string.
 *
 * getMiddle("test") should return "es"
 * getMiddle("testing") should return "t"
 * getMiddle("middle") should return "dd"
 * getMiddle("A") should return "A"
 *
 */
public class GetMiddle {
    public static void main(String args[]) {
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("testing"));
        System.out.println(getMiddle("middle"));
        System.out.println(getMiddle("A"));
    }
    public static String getMiddle(String word) {
        if (word.length() > 0 && word.length() < 1000) {
            final char[] chars = word.toCharArray();
            final int mid = chars.length / 2;
            if (word.length() < 2)
                return word;
            if (chars.length % 2 == 0) {
                return String.valueOf(chars[mid-1]) + String.valueOf(chars[mid]);
            } else {
                return String.valueOf(chars[mid]);
            }
        } else {
            return "";
        }
    }
}
