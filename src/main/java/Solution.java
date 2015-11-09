public class Solution {


    public int removeDuplicates(int[] nums) {
        if(nums == null) throw new NullPointerException("Array is null");

        int j = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == nums[j]) {
                i++;
            } else {
                j++;
                nums[j] = nums[i];
                i++;
            }
        }
        return j + 1;
    }






}
