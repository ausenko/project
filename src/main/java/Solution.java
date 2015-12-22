/**
 * Created by Anton on 21.12.15.
 */
public class Solution {

    public static boolean isPalindrome(String text) {

        int len = text.length();

        for (int i = 0; i < len / 2; i++) {
            if (text.charAt(i) != text.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("aba"));
    }
}
