import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Anton on 24.05.16.
 */
public class WeightSortTest {

    @Test
    public void testOrderWeight() {
        assertEquals("103 123 4444", WeightSort.orderWeight("103 123 4444"));
        assertEquals("11 11 2000 10003 22 123 1234000 44444444 9999", WeightSort.orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));

    }
}
