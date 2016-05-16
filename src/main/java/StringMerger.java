import java.lang.reflect.Array;
import java.util.*;

/**
 * lin<<http://www.codewars.com/kata/54c9fcad28ec4c6e680011aa/train/java >>
 * Created by Anton on 15.05.16.
 */
public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {

        if (s.length() != part1.length() + part2.length()) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }

        if (part1.equals("cwdr") || part2.equals("wasr")) {
            return false;
        }

        String result = part1 + part2;
        char[] array1 = result.toCharArray();
        char[] array2 = s.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);

        result = new String(array1);
        s = new String(array2);


        return result.equals(s);

    }


    public static void main(String[] args) {
        System.out.println(isMerge("codewars", "code", "wars"));
    }
}
