/**
 * Created by Anton on 06.04.16.
 */
public class DnaStrand {

    // Part one:
    public static char getComplement(char symbol) {

        switch (symbol) {
            case 'A':
                return 'T';
            case 'T':
                return 'A';
            case 'C':
                return 'G';
            case 'G':
                return 'C';
        }
        return symbol;
    }


    public static String makeComplement(String dna) {

        char[] charsResult = dna.toCharArray();
        for (int i = 0; i < charsResult.length; i++) {
            charsResult[i] = getComplement(charsResult[i]);
        }

        return new String(charsResult);
    }



    //Part two
    public static String makeComplementSecond(String dna){
        char[]  charsResult = dna.toCharArray();
        for (int i = 0; i < charsResult.length; i++) {
            char symbol = charsResult[i];
            charsResult[i] =(symbol=='A') ? 'T'
                    :symbol == 'T' ? 'A'
                    :symbol == 'C' ? 'G'
                    :symbol == 'G' ? 'C'
                    :symbol == 'A' ? 'T'
                    :symbol;
        }
        return new String(charsResult);
    }



    public static void main(String[] args) {

        System.out.println(makeComplement("AAAA"));
        System.out.println(makeComplementSecond("CGGC"));

    }

    

}
