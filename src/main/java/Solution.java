/**
 * <li>https://leetcode.com/problems/reverse-integer/</li>
 * <p>
 * <p>
 * <p>
 * <p>
 * Created by Anton on 20.11.15.
 */
public class Solution {
    public int reverse(int x) {

        long rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) ? 0 : (int) rev;
    }
}
