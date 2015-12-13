import java.util.Arrays;

import java.util.*;

/**
 * Created by Anton on 12.12.15.
 */

public class Solution {
    public int[] sorted(int[] nums) {

        int temp = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }


    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i += 2) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        throw new IllegalArgumentException("Invalid array");

    }


    public static void main(String[] args) {

        Solution sl = new Solution();
        System.out.println(sl.singleNumber(sl.sorted(new int[]{2, 3, 1})));

    }

}
