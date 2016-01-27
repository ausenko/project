import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Anton on 27.01.16.
 */

public class SolutionTest {
    Solution sl = new Solution();


    @Test
    public void testTitleToNumber() {
        assertEquals(0, sl.titleToNumber(null));
        assertEquals(1, sl.titleToNumber("A"));
        assertEquals(4, sl.titleToNumber("D"));
        assertEquals(27, sl.titleToNumber("AA"));
        assertEquals(28, sl.titleToNumber("AB"));

    }


    @Test
    public void testConvertToTitle() {
        assertEquals(null,sl.convertToTitle(-1));
        assertEquals(null,sl.convertToTitle(0));
        assertEquals("A",sl.convertToTitle(1));
        assertEquals("D", sl.convertToTitle(4));
        assertEquals("AA", sl.convertToTitle(27));
        assertEquals("AB", sl.convertToTitle(28));


    }


}
