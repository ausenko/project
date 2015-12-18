import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;

/**
 * Created by Anton on 19.12.15.
 */
public class IsPrimeTest {

    @Test
    public void testIsPrime() {
        assertFalse(Solution.isPrime(1));
        assertTrue(Solution.isPrime(2));
        assertTrue(Solution.isPrime(13));
        assertTrue(Solution.isPrime(23));
        assertFalse(Solution.isPrime(62));
    }

}
