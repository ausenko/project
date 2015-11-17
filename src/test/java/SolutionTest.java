import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by zhenya on 16.11.15.
 */
public class SolutionTest {

    @Test
    public void testcomputeArea() {

        assertEquals(16, Solution.computeArea(-2, -2, 2, 2, -2, -2, 2, 2));
        assertEquals(0, Solution.computeArea(1, 1, 1, 1, 1, 1, 1, 1));
        assertEquals(0, Solution.computeArea(0, 0, 0, 0, 0, 0, 0, 0));
        assertEquals(8, Solution.computeArea(1, 2, 3, 4, 5, 6, 7, 8));
        assertEquals(-12, Solution.computeArea(2, 3, 4, -5, -6, -7, -8, -9));

    }


}
