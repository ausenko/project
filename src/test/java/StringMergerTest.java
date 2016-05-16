import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Anton on 15.05.16.
 */
public class StringMergerTest {

    @Test
    public void testIsMerge() {

        assertTrue(StringMerger.isMerge("codewars", "code", "wars"));
        assertTrue(StringMerger.isMerge("cdwr", "cd", "wr"));
        assertTrue(StringMerger.isMerge("dcrw", "cd", "rw"));
        assertFalse(StringMerger.isMerge("cdwrr", "cd", "wr"));
        assertFalse(StringMerger.isMerge("crr", "cd", "wr"));


    }


}
