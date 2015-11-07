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

    //  @Test
    //public void testToString() {
    //  assertNull(ArrayUtils.toString(null));
    // assertEquals("[1, 2, 3]", ArrayUtils.toString(new int[]{1, 2, 3}));
    //   assertEquals("[0, -1                        ]", ArrayUtils.toString(new int[]{0, -1}));
    // }

    @Test
    public void testMerge() {
        int[] array1 = new int[]{1, 2, 0, 0};
        int[] array2 = new int[]{1, 2};

        int[] expected = new int[]{1, 2, 1, 2};
        assertArrayEquals(expected, ArrayUtils.merge(array1, 2, array2, 2));

    }



    @Test(expected = IllegalArgumentException.class)
    public void testMergeWitExceptionWithhNegativeArraySize() {
        int[] array1 = new int[]{1, 2, 0, 0};
        int[] array2 = new int[]{1, 2};

        ArrayUtils.merge(array1, -1, array2, -2);

    }


    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testMergeWithExceptionWithLargeNumber(){
        int [] arra1 = new int[]{1,2,0,0};
        int [] arra2 = new int[]{1,2};

        ArrayUtils.merge(arra1,5,arra2,3);
    }


    @Test(expected = NullPointerException.class)
    public void testSortArrayWithExceptionWithNullPointerException(){
        ArrayUtils.sortArray(null);
    }
}
