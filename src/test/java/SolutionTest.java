import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Anton on 20.11.15.
 */
public class SolutionTest {

    @Test
    public void testReverse() {

        Solution sl = new Solution();

        assertEquals(0, sl.reverse(2147483647));
        assertEquals(0, sl.reverse(-2147483648));
        assertEquals(0, sl.reverse(0));
        assertEquals(1, sl.reverse(1));
        assertEquals(22, sl.reverse(22));
        assertEquals(-22, sl.reverse(-22));
        assertEquals(123, sl.reverse(321));
        assertEquals(-321, sl.reverse(-123));


    }

}
