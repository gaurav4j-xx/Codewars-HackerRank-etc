package strings;


public class ComplementaryDNA {
    public static void main(String args[]) {
        System.out.println(makeComplement("ATTGC"));
        System.out.println(makeComplement("GTAT"));
    }

    public static String makeComplement(String dna) {
        char[] input = dna.toCharArray();
        char[] result = new char[input.length];

        for (int i = 0; i < input.length; i++) {
            result[i] = complementStrand(input[i]);
        }
        return new String(result);
    }

    private static char complementStrand(char input) {
        switch (input) {
            case 'T':
                return 'A';
            case 'A':
                return 'T';
            case 'G':
                return 'C';
            case 'C':
                return 'G';
            default:
                return input;
        }

    }
}