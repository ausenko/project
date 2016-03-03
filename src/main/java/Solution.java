/**
 * lin <<https://leetcode.com/problems/single-number-iii/>>
 * <p>
 * Created by Anton on 02.03.16.
 */
public class Solution {


    public int[] sorted(int[] nums) {

        int temp = 0;

        for (int i = nums.length - 1; i > 0; i--) {
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


    public int[] singleNumber(int[] nums) {

        int index = 0;
        int[] array = new int[2];


        for (int i = 0; i <= nums.length - 1; ++i) {
            if ((i == 0 || nums[i] > nums[i - 1]) && (i == nums.length - 1 || nums[i] < nums[i + 1])) {
                array[index++] = nums[i];
            }

        }
        return array;
    }


    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "]" + "=" + array[i]);
        }
    }


    public static void main(String[] args) {
        Solution sl = new Solution();
        sl.print(sl.sorted(new int[]{2, 3, 4, 4, 6, 6}));
        System.out.println();

        sl.print((sl.singleNumber(sl.sorted(new int[]{2, 3, 4, 4, 6, 6}))));
    }


}
