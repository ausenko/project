import  org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

/**
 *
 * Created by Anton on 01.04.16.
 */
public class FindOutlierTest {

    @Test
    public void testFind(){
        int[] exampleTest1 = {2,6,8,-10,3};
        int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        int[] exampleTest4 = {1,2,2};
        int[] exampleTest5 = {1,1,6};
        assertEquals(3, FindOutlier.find(exampleTest1));
        assertEquals(206847684, FindOutlier.find(exampleTest2));
        assertEquals(0, FindOutlier.find(exampleTest3));
        assertEquals(1, FindOutlier.find(exampleTest4));
        assertEquals(6, FindOutlier.find(exampleTest5));

    }
}
