import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anton on 31.01.16.
 * <p>
 * lin << https://leetcode.com/problems/generate-parentheses/ >>
 */


public class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<String>();
        if (n == 0) {
            return result;
        }
        generate(result, "", n, n);
        return result;
    }


    public void generate(List<String> result, String str, int left, int right) {

        if (left == 0 && right == 0) {
            result.add(str);
            return;
        }

        if (left > 0) {
            generate(result, str + "(", left - 1, right);
        }
        if (right > left) {
            generate(result, str + ")", left, right - 1);
        }
    }

    public static void main(String[] ar) {
        Solution sl = new Solution();
        System.out.println(sl.generateParenthesis(2));

    }
}
