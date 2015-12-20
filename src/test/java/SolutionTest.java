import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by zhenya on 20.12.15.
 */
public class SolutionTest {

    @Test
    public void testMergeArrays() {
        int[] arr1 = new int[]{0, 1};
        int[] arr2 = new int[]{2, 3};
        assertArrayEquals(new int[]{0, 1, 2, 3}, Solution.mergeArrays(arr1, arr2));

        int[] ar1 = new int[]{0, 0};
        int[] ar2 = new int[]{0, 0};
        assertArrayEquals(new int[]{0, 0, 0, 0}, Solution.mergeArrays(ar1, ar2));

        int[] a1 = new int[]{-2, 1};
        int[] a2 = new int[]{-4, -1};
        assertArrayEquals(new int[]{-4, -2, -1, 1}, Solution.mergeArrays(a1, a2));

        int[] a = new int[]{0};
        int[] b = new int[]{1, 2};
        assertArrayEquals(new int[]{0, 1, 2}, Solution.mergeArrays(a, b));

        int[] c = new int[0];
        int[] d = new int[]{0, 1};
        assertArrayEquals(new int[]{0, 1}, Solution.mergeArrays(c, d));


    }
}
