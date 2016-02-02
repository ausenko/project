import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by zhenya on 02.02.16.
 */
public class SolutionTest {

    Solution sl = new Solution();

    @Test
    public void TestGenerateParenthesis() {
        List<String> list = new ArrayList<>();
        list.add("()");
        assertEquals(new ArrayList<String>(), sl.generateParenthesis(0));
        assertEquals(list, sl.generateParenthesis(1));

        List<String> expected = new ArrayList<>();
        expected.add("(()), ()()");
        assertEquals(expected, sl.generateParenthesis(2));


    }
}
