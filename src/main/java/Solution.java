/**
 *<li>https://leetcode.com/problems/missing-number/</li>
 *
 * Created by Anton on 26.11.15.
 */
public class Solution {
    public int missingNumber(int[] nums) {
        if (nums.length == 0) return 0;

        int sum = 0;
        int length = nums.length;
        for (int i = 0; i <= length; i++) {
            sum += i;
        }
        for (int i : nums) {
            sum -= i;
        }
        return sum;
    }
}