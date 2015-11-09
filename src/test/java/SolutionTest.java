import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SolutionTest {


    Solution sol = new Solution();


    @Test
    public void testRemoveDuplicates() {


        int[] arr = new int[]{1, 1, 2};
        int expected = 2;
        assertEquals(expected, sol.removeDuplicates(arr));

        int[] arr1 = new int[]{0};
        int excepted1 = 1;
        assertEquals(excepted1, sol.removeDuplicates(arr1));

        int[] arr2 = new int[]{1, 1};
        int excepted2 = 1;
        assertEquals(excepted2, sol.removeDuplicates(arr2));

        int[] arr3 = new int[]{0, 0};
        int excepted3 = 1;
        assertEquals(excepted3, sol.removeDuplicates(arr3));

        int[] arr4 = new int[]{-1, 1};
        int excepted4 = 2;
        assertEquals(excepted4, sol.removeDuplicates(arr4));


    }

    @Test(expected = NullPointerException.class)
    public void testRemoveDuplicatesWithExceptionNull() {
        sol.removeDuplicates(null);

    }


}
