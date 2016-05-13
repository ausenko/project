/**
 * lin<<http://www.codewars.com/kata/5277c8a221e209d3f6000b56/train/java >>
 *
 * Created by Anton on 11.05.16.
 */
public class BraceChecker {
    public static boolean isValid(String braces) {
        int len = braces.length();
        char[] stack = new char[len + 1];
        int top = 1;
        for (int i = 0; i < len; ++i) {
            char c = braces.charAt(i);
            if (c == '(' || c == '[' || c == '{')
                stack[top++] = c;
            else if (c == ')' && stack[top - 1] != '(')
                return false;
            else if (c == ']' && stack[top - 1] != '[')
                return false;
            else if (c == '}' && stack[top - 1] != '{')
                return false;
            else
                --top;
        }
        if (top == 1)
            return true;
        return false;
    }



    public static void main(String[] args) {
        System.out.println(isValid("({[]})"));
    }

}
