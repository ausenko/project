import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by Anton on 24.05.16.
 */
public class WeightComparatorTest {
    WeightComparator weightComparator = new WeightComparator();

    @Test
    public void testCompare() {

        assertEquals(-1, weightComparator.compare("123", "124"));
        assertEquals(1, weightComparator.compare("124", "123"));
        assertEquals(0, weightComparator.compare("124", "124"));

    }

    @Test
    public void testSumOfDigit() {

        assertEquals(0, WeightComparator.sumOfDigit("0"));
        assertEquals(2, WeightComparator.sumOfDigit("11"));
        assertEquals(6, WeightComparator.sumOfDigit("123"));


    }


}
