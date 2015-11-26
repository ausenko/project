import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Anton on 25.11.15.
 */
public class SolutionTest {

    Solution sl = new Solution();

    @Test
     public void testNewVersionString(){
        assertNull(sl.newVersionString(null));
        assertEquals("0", sl.newVersionString("0"));
        assertEquals("123", sl.newVersionString("1.2.3"));
        assertEquals("-123", sl.newVersionString("-1.2.3."));
        assertEquals("001", sl.newVersionString("0.0.1"));
        assertEquals("10", sl.newVersionString("1.0..........."));
        assertEquals("01", sl.newVersionString("0.............1"));
        assertEquals("01AB", sl.newVersionString("0.1.A.B"));
        assertEquals("01aS1a11", sl.newVersionString("01aS1a11"));

    }

    @Test
    public void testNewTypeVersion(){

        assertEquals(0.0,sl.newTypeVersion("0.0"));
        assertEquals(123.0,sl.newTypeVersion("1.2.3"));
    }


}
