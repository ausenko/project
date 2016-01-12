import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by zhenya on 12.01.16.
 */


public class SolutionTest {
    Solution sl = new Solution();

    @Test
    public void testGenerate(){
        int[] expected = new int[]{0,1,2};
        int[] result = sl.generate(3);
        assertArrayEquals(expected,result);

        int[] expected1 = new int[0];
        int[] result1 = sl.generate(0);
        assertArrayEquals(expected1,result1);

        int[] expected2 = new int[]{0,1,2,3,4,5,6,7};
        int[] result2 = sl.generate(8);
        assertArrayEquals(expected2,result2);
    }


    @Test
    public void testPointValues(){

        int[] expected = new int[]{2,4,6};
        int[] result = sl.pointValues(new int[]{0, 1, 2, 3, 4, 5, 6, 7});
        assertArrayEquals(expected,result);

        int[] expected1 = new int[0];
        int[] result1 = sl.pointValues(new int[0]);
        assertArrayEquals(expected1,result1);


    }


    @Test(expected = NullPointerException.class)
    public void testPointValuesWithExceptionNull(){
        sl.pointValues(null);
    }
}












