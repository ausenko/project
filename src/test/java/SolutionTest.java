import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertFalse;

/**
 * Created by Anton on 22.12.15.
 */
public class SolutionTest {

    @Test
    public void testIsPalindrome() {
        assertTrue(Solution.isPalindrome("121"));
        assertTrue(Solution.isPalindrome("aba"));
        assertFalse(Solution.isPalindrome("abc"));
        assertTrue(Solution.isPalindrome("0"));
        assertFalse(Solution.isPalindrome("-1"));
    }

}
