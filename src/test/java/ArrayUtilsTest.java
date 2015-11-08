import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Ievgen Usenko
 */
public class ArrayUtilsTest {

    @Test
    public void testIsOrdered() {
        assertTrue(ArrayUtils.isOrdered(new int[0]));
        assertTrue(ArrayUtils.isOrdered(new int[]{0}));
        assertTrue(ArrayUtils.isOrdered(new int[]{1}));
        assertTrue(ArrayUtils.isOrdered(new int[]{-1}));

        assertTrue(ArrayUtils.isOrdered(new int[]{0, 0}));
        assertTrue(ArrayUtils.isOrdered(new int[]{1, 1}));
        assertTrue(ArrayUtils.isOrdered(new int[]{0, 2, 3}));
        assertTrue(ArrayUtils.isOrdered(new int[]{-1, 0, 1}));

        assertFalse(ArrayUtils.isOrdered(new int[]{3, 2}));
        assertFalse(ArrayUtils.isOrdered(new int[]{0, -1}));
    }

    @Test
    public void testToString() {
        assertNull(ArrayUtils.toString(null));
        assertEquals("[1, 2, 3]", ArrayUtils.toString(new int[]{1, 2, 3}));
        assertEquals("[0, -1]", ArrayUtils.toString(new int[]{0, -1}));
    }

    @Test
    public void testRemoveDublicatesArray(){

        int[] arr = new int[]{1,1,2,3,3};
        int expected = 3;
        assertEquals(expected,ArrayUtils.removeDublicatesArray(arr));

        int[] arr1 = new int[]{0};
        int expected1 = 1;
        assertEquals(expected1,ArrayUtils.removeDublicatesArray(arr1));

        int[] arr2 = new int[]{1,1};
        int expected2 = 1;
        assertEquals(expected2,ArrayUtils.removeDublicatesArray(arr2));

        int[] arr3 = new int[]{0,0};
        int expected3 = 1;
        assertEquals(expected3,ArrayUtils.removeDublicatesArray(arr3));

        int[] arr4 = new int[]{-1,1};
        int expected4 = 2;
        assertEquals(expected4,ArrayUtils.removeDublicatesArray(arr4));


    }

    @Test(expected = NullPointerException.class)
        public void testRemoveDublicatesArrayWithExceptionNull(){
            ArrayUtils.removeDublicatesArray(null);
        }
    }

