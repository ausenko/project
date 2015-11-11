import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by zhenya on 10.11.15.
 */
public class SolutionTest {

    @Test
    public void testMerge() {

        int[] arr = new int[]{1, 2, 0, 0};
        int[] arr1 = new int[]{1, 2};
        assertArrayEquals(new int[]{1, 1, 2, 2}, Solution.merge(arr, 2, arr1, 2));

    }


    @Test(expected = IllegalArgumentException.class)
    public void testMergeExceptionWithIllegalArgumentException(){

        int[] ar1 = new int[]{0,0,0,0};
        int[] ar2 = new int[]{0,0,0,0};
        assertArrayEquals(new int[]{0,0,0,0}, Solution.merge(ar1,0, ar2,0));

        int[] arr1 = new int[]{0,0,0,0};
        int[] arr2 = new int[]{1,2,3,0};
        assertArrayEquals(new int[]{1,2,3,0}, Solution.merge(ar1,0, ar2,3));

        int[] a1 = new int[]{1,2,3,0};
        int[] a2 = new int[]{0,0,0,0};
        assertArrayEquals(new int[]{1,2,3,0}, Solution.merge(a1,3, a2,0));

    }
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testMergeExceptionWithArrayIndexOutOfBoundsException(){
        int[] ar1 = new int[]{1,2,3,0,0};
        int[] ar2 = new int[]{1,2,0,0};
        assertArrayEquals(new int[]{1,2,3,1,2},Solution.merge(ar1,6,ar2,4));
    }
}