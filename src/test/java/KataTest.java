
import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


/**
 * Created by Anton on 17.04.16.
 */
public class KataTest {


    @Test
    public void testGetPrimeValue() {

        long[] data = new long[]{11, 13, 17, 19};
        List<Long> result = BackWardsPrime.getPrimeValue(2, 22);
        assertEquals(result.get(0), 11, 0);
        assertEquals(result.get(1), 13, 0);
        assertEquals(result.get(2), 17, 0);
        assertEquals(result.get(3), 19, 0);

        long[] data1 = new long[]{11};
        List<Long> result1 = BackWardsPrime.getPrimeValue(2, 12);
        assertEquals(result1.get(0), 11, 0);

        long[] data2 = new long[]{23, 29};
        List<Long> result2 = BackWardsPrime.getPrimeValue(22, 30);
        assertEquals(result2.get(0), 23, 0);
        assertEquals(result2.get(1), 29, 0);
    }


    @Test
    public void testIsPrime() {
        assertFalse(BackWardsPrime.isPrime(1));
        assertTrue(BackWardsPrime.isPrime(2));
        assertFalse(BackWardsPrime.isPrime(12));
        assertTrue(BackWardsPrime.isPrime(13));
        assertTrue(BackWardsPrime.isPrime(23));
        assertFalse(BackWardsPrime.isPrime(62));

    }

    @Test
    public void testRevers() {
        assertEquals(0, BackWardsPrime.revers(0));
        assertEquals(1, BackWardsPrime.revers(1));
        assertEquals(22, BackWardsPrime.revers(22));
        assertEquals(123, BackWardsPrime.revers(321));
    }


    @Test
    public void testBackWardsPrime() {
        assertEquals("13 17 31 37 71 73 79 97", BackWardsPrime.backwardsPrime(1, 100));
        assertEquals("9923 9931 9941 9967", BackWardsPrime.backwardsPrime(9900, 10000));
    }


    @Test
    public void testBackWardsPrimeStringIndexOutBounsException() {
        assertEquals("", BackWardsPrime.backwardsPrime(0, 0));
        assertEquals("", BackWardsPrime.backwardsPrime(0, -1));

        assertEquals("", BackWardsPrime.backwardsPrime(-10, -1));
        assertEquals("", BackWardsPrime.backwardsPrime(0, Long.MAX_VALUE));

    }
}
