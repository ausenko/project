import java.util.HashMap;
import java.util.Map;

/**
 * lin <<http://www.codewars.com/kata/554e4a2f232cdd87d9000038/train/java >>
 * <p>
 * <p>
 * <p>
 * Created by Anton on 08.04.16.
 */
public class DnaStrand {

    public static String makeComplement(String dna) {

        Map<Character, Character> map = new HashMap<>();

        map.put('A', 'T');
        map.put('T', 'A');
        map.put('C', 'G');
        map.put('G', 'C');

        String stringResult = "";
        for (int i = 0; i < dna.length(); i++) {
            stringResult += map.get(dna.charAt(i));
        }
        return stringResult;
    }


    public static void main(String[] args) {
        System.out.println(makeComplement("AAAA"));
        System.out.println(makeComplement("CCGGTT"));
    }
}
