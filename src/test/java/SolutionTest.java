import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Anton on 03.03.16.
 */
public class SolutionTest {

    @Test
    public void testSingleNumber() {

        Solution sl = new Solution();

        assertArrayEquals(new int[]{3, 5}, sl.singleNumber(new int[]{1, 2, 1, 3, 2, 5}));
        assertArrayEquals(new int[]{-1, 0}, sl.singleNumber(new int[]{-1, 0}));
        assertArrayEquals(new int[]{0, 0}, sl.singleNumber(new int[]{0, 0}));
        assertArrayEquals(new int[]{2, 3}, sl.singleNumber(new int[]{3, 4, 2, 4, 6, 6}));
        assertArrayEquals(new int[]{0, 1}, sl.singleNumber(new int[]{1, 0}));
        assertArrayEquals(new int[]{0, 1}, sl.singleNumber(new int[]{0, 1}));

    }
}
