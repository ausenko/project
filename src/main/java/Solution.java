/**
 * Created by Anton on 25.01.16.
 * <p>
 * lin<https://leetcode.com/problems/excel-sheet-column-number/>lin
 * <p>
 * lin<https://leetcode.com/problems/excel-sheet-column-title/>lin
 */
public class Solution {


    public int titleToNumber(String s) {
        if( s == null) return 0;
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            res = res * 26 + (s.charAt(i) - 'A' + 1);
        }
        int n = res;
        return n;
    }


    public String convertToTitle(int n) {
        if (n <= 0) return null;


        String res = "";
        while (n > 0) {
            char ch = (char) ((n - 1) % 26 + 65);
            n = (n - 1) / 26;
            res = res + ch;
        }

        return res;
    }


    public static void main(String[] args) {

        Solution sl = new Solution();
        System.out.println(sl.titleToNumber("AB"));
        System.out.println(sl.convertToTitle(sl.titleToNumber("AB")));


    }
}
