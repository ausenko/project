/**
 *
 * lin<<http://www.codewars.com/kata/55c04b4cc56a697bb0000048/train/java >>
 *
 *
 * Created by Anton on 25.04.16.
 */
public class Scramblies {


    public static boolean scramble(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return false;
        }
        StringBuilder temp = new StringBuilder(str1);
        for (int i = 0; i < str2.length(); i++) {

            int potentialChar = getIndex(temp, str2.charAt(i));
            if (potentialChar < 0) {
                return false;
            }
            temp.deleteCharAt(potentialChar);
        }
        return true;
    }


    public static int getIndex(StringBuilder builder, char element) {
        for (int i = 0; i < builder.length(); i++) {
            if (element == builder.charAt(i)) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args){
        System.out.println(scramble("rkqodlw","world"));
        System.out.println(scramble("cedewaraaossoqqyt","codewars"));
        System.out.println(scramble("scriptjavx","javascrip"));
    }
}

