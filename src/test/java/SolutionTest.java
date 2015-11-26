import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Anton on 26.11.15.
 */
public class SolutionTest {

    @Test
    public void testMissingNumber() {
        Solution sl = new Solution();

        assertEquals(0, sl.missingNumber(new int[0]));
        assertEquals(1, sl.missingNumber(new int[]{0}));
        assertEquals(2, sl.missingNumber(new int[]{0, 1, 3}));
        assertEquals(4, sl.missingNumber(new int[]{0, 1, 2, 3, 5}));
        assertEquals(1, sl.missingNumber(new int[]{0, 2, 3, 4}));
        assertEquals(8, sl.missingNumber(new int[]{0,1,2,3,4,5,6,7,9,10}));

    }


}
