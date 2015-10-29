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
        assertNotEquals("[-1,0,2]",ArrayUtils.toString(new int[]{2,2,2,2,2,2,2}));
        assertEquals("[0, -1]", ArrayUtils.toString(new int[]{0, -1}));
    }
}
