import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Anton on 20.03.16.
 */
public class TestSolution {

    Solution sl = new Solution();

    @Test
    public void testProductExceptSelf() {


        assertArrayEquals(new int[0], sl.productExceptSelf(new int[0]));
        assertArrayEquals(new int[]{1}, sl.productExceptSelf(new int[]{0}));
        assertArrayEquals(new int[]{1, -1, 0}, sl.productExceptSelf(new int[]{-1, 0, 1}));
        assertArrayEquals(new int[]{1, 12, 8, 6}, sl.productExceptSelf(new int[]{1, 2, 3, 4}));


    }
}
