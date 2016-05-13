import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Anton on 13.05.16.
 */
public class BraceCheckerTest {

    @Test
    public void testIsValid(){
        assertTrue(BraceChecker.isValid("[]"));
        assertTrue(BraceChecker.isValid("{}"));
        assertTrue(BraceChecker.isValid("()"));
        assertTrue(BraceChecker.isValid("({})"));
        assertTrue(BraceChecker.isValid("([{()}])"));


        assertFalse(BraceChecker.isValid("[}"));
        assertFalse(BraceChecker.isValid("{[])"));
        assertFalse(BraceChecker.isValid("({[]}}"));
        assertFalse(BraceChecker.isValid("{{{)))"));

    }
}
