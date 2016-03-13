import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by zhenya on 13.03.16.
 */
public class SolutionTest {

    Solution sl = new Solution();


    @Test
    public void testIntToRoman() {
        assertEquals("I", sl.intToRoman(1));
        assertEquals("X", sl.intToRoman(10));
        assertEquals("XXI", sl.intToRoman(21));
        assertEquals("CMXCIX", sl.intToRoman(999));
        assertEquals("XII", sl.intToRoman(12));
    }

    @Test
    public void testIntToRomanSecond() {
        assertEquals("I", sl.intToRoman(1));
        assertEquals("X", sl.intToRoman(10));
        assertEquals("XXI", sl.intToRoman(21));
        assertEquals("CMXCIX", sl.intToRoman(999));
        assertEquals("XII", sl.intToRoman(12));


    }

}
