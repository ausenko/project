import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by Антон on 20.01.16.
 */
public class SolutionTest {


    Solution sl = new Solution();


    @Test(expected = IllegalArgumentException.class)
    public void testIsSearchMaxValueWithExceptionIllegalArgument() {
        sl.isSearchMaxValue(new int[0]);

    }

    @Test
    public void testIsSearchMaxValue() {

        assertEquals(5, sl.isSearchMaxValue(new int[]{2, 4, 5, 3, 4, 4, 4, 4}));
        assertEquals(0, sl.isSearchMaxValue(new int[]{0}));
        assertEquals(1, sl.isSearchMaxValue(new int[]{-1, 1}));
        assertEquals(4, sl.isSearchMaxValue(new int[]{4, 4, 4, 4, 4}));
        assertEquals(8, sl.isSearchMaxValue(new int[]{1, -1, 0, 2, 3, 6, 5, 8, 2, 3, 4, 8}));

    }


    @Test
    public void testIsZeroFirstMax() {
        assertEquals(0, sl.isZeroFirstMax(new int[]{2, 4, 5, 3, 5, 4, 7, 1}));
        assertEquals(0, sl.isZeroFirstMax(new int[]{0}));
        assertEquals(0, sl.isZeroFirstMax(new int[]{-1, 15, 2, 3, 4}));
        assertEquals(0, sl.isZeroFirstMax(new int[]{2, 4, 7, 0, 1}));
        assertEquals(0, sl.isZeroFirstMax(new int[]{1, -1, 0, 2, 3, 6, 5, 8, 2, 3, 4, 8}));


    }

}
