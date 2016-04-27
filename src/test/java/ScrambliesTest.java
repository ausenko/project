import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by Anton on 28.04.16.
 */
public class ScrambliesTest {

    @Test
    public void testScrambliese() {


        assertFalse(Scramblies.scramble("katas", "steak"));
        assertFalse(Scramblies.scramble("scriptjavx", "javascript"));
        assertTrue(Scramblies.scramble("scriptingjava", "javascript"));
        assertTrue(Scramblies.scramble("scriptsjava", "javascripts"));
        assertFalse(Scramblies.scramble("javscripts", "javascript"));
        assertTrue(Scramblies.scramble("aabbcamaomsccdd", "commas"));
    }

}

