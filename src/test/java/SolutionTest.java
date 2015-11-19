import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * <li>https://leetcode.com/problems/length-of-last-word/</li>
 * Created by Anton on 19.11.15.
 */
public class SolutionTest {

    @Test
    public void testLengthOFLastWord() {


        assertEquals(0, Solution.lengthOFLastWord(null));
        assertEquals(0, Solution.lengthOFLastWord(" "));
        assertEquals(5, Solution.lengthOFLastWord("Hello World"));
        assertEquals(5, Solution.lengthOFLastWord("hello world"));
        assertEquals(5, Solution.lengthOFLastWord("HELLO WORLD"));
        assertEquals(10, Solution.lengthOFLastWord("HelloWorld"));
        assertEquals(3, Solution.lengthOFLastWord("World is very big"));
        assertEquals(14, Solution.lengthOFLastWord("WorldIsVeryBig"));

    }

}
