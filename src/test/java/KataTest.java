import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by Anton on 08.05.16.
 */
public class KataTest {

    @Test
    public void testValidPhoneNumber() {
        assertTrue(Kata.validPhoneNumber("(123) 456-7890"));
        assertFalse(Kata.validPhoneNumber("(1111)555 2345"));
        assertFalse(Kata.validPhoneNumber("(098) 123 4567"));
    }
}
