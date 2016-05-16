import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

/**
 * Created by Anton on 16.05.16.
 */
public class GapInPrimesTest {

    @Test
    public void testGap(){
        assertEquals("[101, 103]", Arrays.toString(GapInPrimes.gap(2,100,110)));
        assertEquals("[103, 107]", Arrays.toString(GapInPrimes.gap(4,100,110)));
        assertEquals(null, GapInPrimes.gap(6,100,110));
        assertEquals("[359, 367]", Arrays.toString(GapInPrimes.gap(8,300,400)));
        assertEquals("[337, 347]", Arrays.toString(GapInPrimes.gap(10,300,400)));

    }

}
