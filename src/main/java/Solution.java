/**
 * Created by zhenya on 10.11.15.
 */
public class Solution {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {


        if (n <=0 || m <= 0) throw new IllegalArgumentException();
        if (m > nums1.length || n > nums2.length) throw new ArrayIndexOutOfBoundsException();

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j > 0) {
            nums1[k--] = nums2[j--];
        }
        return nums1;

    }

}
