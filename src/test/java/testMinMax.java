import org.junit.Test;

        import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Anton on 09.05.16.
 */
public class testMinMax {

    @Test
    public void testSorted() {
        assertArrayEquals(new int[]{1, 2, 3}, MinMax.sorted(new int[]{3, 1, 2}));
        assertArrayEquals(new int[]{0}, MinMax.sorted(new int[]{0}));
        assertArrayEquals(new int[]{-2, -1, 0, 1}, MinMax.sorted(new int[]{-1, 0, 1, -2}));
    }

    @Test
    public void testMinMax() {
        assertArrayEquals(new int[]{1, 5}, MinMax.minMax(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{5, 233}, MinMax.minMax(new int[]{233, 5}));
        assertArrayEquals(new int[]{1, 1}, MinMax.minMax(new int[]{1, 1}));
    }
}
