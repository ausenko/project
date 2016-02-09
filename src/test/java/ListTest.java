import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

/**
 * Created by Anton on 05.02.16.
 */
public class ListTest {

    @Test
    public void testAdd() {
        final List<Integer> list = new List<Integer>();

        list.add(Integer.valueOf(1));
        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(1, list.size());

        list.add(Integer.valueOf(2));
        assertEquals(Integer.valueOf(2), list.get(1));
        assertEquals(2, list.size());

        list.add(Integer.valueOf(3));
        assertEquals(Integer.valueOf(3), list.get(2));
        assertEquals(3, list.size());
    }


    @Test
    public void testRemove() {
        final List<Integer> list = new List<Integer>();

        list.add(1);    //0 -->2 -->3 -->3
        list.add(2);    //1 -->3 -->4 -->4
        list.add(3);    //2 -->4 -->5 -->6
        list.add(4);    //3 -->5 -->6
        list.add(5);    //4 -->6
        list.add(6);    //5


        list.remove(1);
        assertEquals(new Integer(2), list.get(0));

        list.remove(2);
        assertEquals(new Integer(3), list.get(0));

        list.remove(5);
        assertEquals(new Integer(6), list.get(3));

    }

    @Test
    public void testRemoveIndex() {
        final List<Integer> list = new List<Integer>();

        list.add(1);    //0 --> 2 -->3
        list.add(2);    //1 --> 3 -->4
        list.add(3);    //2 --> 4 -->5
        list.add(4);    //3 --> 5 -->6
        list.add(5);    //4 --> 6
        list.add(6);    //5

        list.removeIndex(0);
        assertEquals(new Integer(2), list.get(0));

        list.removeIndex(0);
        assertEquals(new Integer(3), list.get(0));

        list.removeIndex(2);
        assertEquals(new Integer(6), list.get(2));
    }


    @Test
    public void testSize() {
        final List<Integer> list = new List<Integer>();
        assertEquals(0, list.size());

        list.add(Integer.valueOf(1));
        assertEquals(1, list.size());

        list.add(Integer.valueOf(2));
        assertEquals(2, list.size());

        list.add(Integer.valueOf(3));
        assertEquals(3, list.size());

        list.remove(1);
        assertEquals(3, list.size());

    }


    @Test(expected = IllegalArgumentException.class)
    public void testGetByInvalidIndex() {
        new List<Integer>().get(10);
    }


}
