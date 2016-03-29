import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
/**
 * Created by Anton on 28.03.16.
 */
public class DigitizeExapmleTest {

    @Test
    public void test(){
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, Kata.giditize(54321));
        assertArrayEquals(new int[] {1, 2, 3}, Kata.giditize(321));

    }


}
