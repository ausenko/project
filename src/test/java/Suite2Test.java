import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Anton on 06.05.16.
 */
public class Suite2Test {

    @Test
    public void testGame() {
        assertEquals("[0]", Suite2.game(0));
        assertEquals("[1,2]", Suite2.game(1));
        assertEquals("[32]", Suite2.game(8));
    }
}
