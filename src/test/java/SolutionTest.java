import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by zhenya on 16.12.15.
 */
public class SolutionTest {


    @Test
    public void testIsPrime() {
        assertFalse(Solution.isPrime(1));
        assertTrue(Solution.isPrime(2));
        assertTrue(Solution.isPrime(13));
        assertTrue(Solution.isPrime(23));
        assertFalse(Solution.isPrime(62));


    }


}
