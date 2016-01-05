import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


/**
 * Created by Антон on 04.01.16.
 */
public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testMerge() {

        int[] ar1 = new int[]{1, 0};
        int[] ar2 = new int[]{3, 2};
        assertArrayEquals(new int[]{1, 0, 3, 2}, solution.merge(ar1, ar2));

        int[] arr1 = new int[]{0, 0};
        int[] arr2 = new int[]{0, 0};
        assertArrayEquals(new int[]{0, 0, 0, 0}, solution.merge(arr1, arr2));

        int[] a = new int[]{-2, -1};
        int[] b = new int[]{-4, -3};
        assertArrayEquals(new int[]{-2, -1, -4, -3}, solution.merge(a, b));

        int[] a1 = new int[]{0};
        int[] b1 = new int[]{2, 1};
        assertArrayEquals(new int[]{0, 2, 1}, solution.merge(a1, b1));


        int[] c = new int[0];
        int[] d = new int[]{0, 1};
        assertArrayEquals(new int[]{0, 1}, solution.merge(c, d));


    }
}
