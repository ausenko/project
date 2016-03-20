/**
 * lin<<https://leetcode.com/problems/product-of-array-except-self/>>
 * <p>
 * <p>
 * Created by Anton on 18.03.16.
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }


        int length = nums.length;
        int[] output = new int[length];
        output[0] = 1;
        for (int i = 1; i < length; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }


        int productFromTail = 1;
        for (int i = nums.length - 2; i > 0; i--) {
            productFromTail *= nums[i + 1];
            output[i] *= productFromTail;
        }
        return output;
    }


    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "]" + " = " + array[i]);
        }
    }


    public static void main(String[] args) {
        Solution sl = new Solution();
        sl.print(sl.productExceptSelf(new int[]{1, 2, 3, 4}));
    }
}