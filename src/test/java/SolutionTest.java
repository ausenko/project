import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by zhenya on 12.12.15.
 */
public class SolutionTest {
    Solution sl = new Solution();

    @Test
    public void testSorted() {
        assertArrayEquals(new int[]{1, 1, 2, 2, 3}, sl.sorted(new int[]{2, 1, 2, 1, 3}));
        assertArrayEquals(new int[]{1, 1, 2, 3, 3}, sl.sorted(new int[]{1, 2, 3, 1, 3}));
        assertArrayEquals(new int[]{2, 3, 3, 4, 4, 5, 5}, sl.sorted(new int[]{3, 4, 3, 4, 5, 2, 5}));
        assertArrayEquals(new int[]{0, 1, 1}, sl.sorted(new int[]{1, 0, 1}));
        assertArrayEquals(new int[]{1, 2, 3}, sl.sorted(new int[]{2, 3, 1}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSingleNumberWithNegativeArraySize() {
        assertEquals(1, sl.singleNumber(new int[]{1, 2, 3}));


    }


    @Test
    public void testSingleNumber() {
        assertEquals(3, sl.singleNumber(new int[]{2, 2, 3}));
        assertEquals(3, sl.singleNumber(new int[]{2, 2, 4, 4, 9, 9, 6, 6, 3}));
        assertEquals(1, sl.singleNumber(new int[]{1, 2, 2, 3, 3}));
        assertEquals(0, sl.singleNumber(new int[]{0, 1, 1}));
    }
}
