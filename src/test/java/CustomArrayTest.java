import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class CustomArrayTest {

    @Test
    public void testShiftLeft() {

        int[] array = new int[]{1, 2};
        assertEquals(array, CustomArray.shiftLeft(array, 0));


        int [] excepted = new int[]{2,1};
        int[] result = CustomArray.shiftLeft(array, 1);
        assertArrayEquals(excepted, result);
    }


    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testShiftLeftWithExceptionWithNegativeNumber() {
        int[] array = new int[]{1, 2};
        CustomArray.shiftLeft(array, -1);
    }


    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testShiftLeftWithExceptionWithLargeNumber() {
        int[] array = new int[]{1, 2};
        CustomArray.shiftLeft(array, 3);
    }


    @Test(expected = NullPointerException.class)
    public void testShiftLeftWithExceptionNull() {
        CustomArray.shiftLeft(null, 1);

    }


    @Test
    public void testShiftRight() {
        int[] array = new int[]{1, 2};
        assertEquals(array, CustomArray.shiftRight(array, 0));

        int [] excepted = new int[]{2,1};
        int[] result = CustomArray.shiftRight(array, 1);
        assertArrayEquals(excepted, result);

    }


    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testShiftRightWithExceptionWithNegativeNumber() {
        int[] array = new int[]{1, 2};
        CustomArray.shiftRight(array, -1);

    }


    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testShiftRightWithExceptionWithLargeNumber() {
        int[] array = new int[]{1, 2};
        CustomArray.shiftRight(array, 3);
    }


    @Test(expected = NullPointerException.class)
    public void testShiftRigthWithExceptionNull() {
        CustomArray.shiftRight(null, 1);

    }


    @Test
    public void testReverse() {
        int[] array = new int[]{1, 2, 3};

        int[] arr = new int[0];
        int[] res = CustomArray.reverse(arr);
        assertArrayEquals(arr,res);


        int [] excepted = new int[]{3,2,1};
        int[] result = CustomArray.reverse(array);
        assertArrayEquals(excepted, result);

    }


    @Test(expected = NullPointerException.class)
    public void testReverseWithExceptionNull() {
        CustomArray.reverse(null);

    }


    @Test
    public void testRemove() {
        int[] array = new int[]{1, 2, 3};
        assertEquals(array, CustomArray.remove(array, 0));

        int [] excepted = new int[]{3,1,0};
        int[] result = CustomArray.remove(array, 1);
        assertArrayEquals(excepted,result);


        int[] ar = new int[0];
        int[] res = CustomArray.remove(array,1);
        assertArrayEquals(ar,res);


    }


    @Test(expected = NullPointerException.class)
    public void testRemoveWithExceptionNull() {
        CustomArray.remove(null, 1);

    }


    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRemoveWithExceptionWithNegativeNumber() {
        int[] array = new int[]{1, 2, 3};
        CustomArray.remove(array, -1);
    }


    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRemoveWithExceptionWithLargeNumber() {
        int[] array = new int[]{1, 2, 3};
        CustomArray.remove(array, 4);

    }

}
