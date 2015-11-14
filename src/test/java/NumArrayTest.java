import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhenya on 13.11.15.
 */
public class NumArrayTest {

    @Test
    public void test1() {


        int[] array = new int[]{2, 4, -5, -6, 8, 12, -4, 7};
        NumArray numArray = new NumArray(array);
        int range = numArray.sumRange(1, 6);

        assertEquals(9, range);


        int[] array1 = new int[]{0, 0, 0, 0, 0, 1, 0, 0};
        NumArray numArray1 = new NumArray(array1);
        int range1 = numArray1.sumRange(0, 6);

        assertEquals(1, range1);
    }


    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRangeWithExceptionWithLargeArrayIndex() {

        int[] array1 = new int[]{0, 0, -1, 0, 0, 0, 1};
        NumArray numArray1 = new NumArray(array1);
        int range1 = numArray1.sumRange(2, 7);

        assertEquals(0, range1);


        int[] array2 = new int[]{0, 0, -1, 0, 0, 0, 1};
        NumArray numArray2 = new NumArray(array2);
        int range2 = numArray2.sumRange(2, 8);

        assertEquals(0, range2);


        int[] array3 = new int[]{0, 0, 2, 3, 4, 5};
        NumArray numArray3 = new NumArray(array3);
        int range3 = numArray3.sumRange(-1, -1);

        assertEquals(0, range3);


    }
}


