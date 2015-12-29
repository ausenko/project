/**
 * Created by zhenya on 30.12.15.
 */

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SolutionTest {


    Solution sl = new Solution();


    @Test
    public void testMerge() {
        int[] arr1 = new int[]{1, 0};
        int[] arr2 = new int[]{3, 2};
        assertArrayEquals(new int[]{1, 0, 3, 2}, sl.merge(arr1, arr2));

        int[] a1 = new int[]{0, 0};
        int[] a2 = new int[]{0, 0};
        assertArrayEquals(new int[]{0, 0, 0, 0}, sl.merge(a1, a2));

        int[] ar1 = new int[]{-2, -1};
        int[] ar2 = new int[]{-4, -1};
        assertArrayEquals(new int[]{-2, -1, -4, -1}, sl.merge(ar1, ar2));

        int[] a = new int[]{0};
        int[] b = new int[]{2, 1};
        assertArrayEquals(new int[]{0, 2, 1}, sl.merge(a, b));
    
        int[] c = new int[0];
        int[] d = new int[]{0, 1};
        assertArrayEquals(new int[]{0, 1}, sl.merge(c, d));

    }


    @Test
    public void testMergeArrays() {

        int[] arr1 = new int[]{5, 0};
        int[] arr2 = new int[]{6, 7};
        assertArrayEquals(new int[]{0, 5, 6, 7}, sl.mergeArrays(arr1, arr2));

        int[] ar1 = new int[]{-2, -1};
        int[] ar2 = new int[]{-4, -1};
        assertArrayEquals(new int[]{-4, -2, -1, -1}, sl.mergeArrays(ar1, ar2));

        int[] c = new int[0];
        int[] d = new int[]{0, 1};
        assertArrayEquals(new int[]{0, 1}, sl.mergeArrays(c, d));

        int[] a = new int[]{0};
        int[] b = new int[]{2, 1};
        assertArrayEquals(new int[]{0, 1, 2}, sl.mergeArrays(a, b));


    }

}



