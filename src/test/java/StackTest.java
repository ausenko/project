import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Anton on 11.02.16.
 */
public class StackTest {

    private Stack<Integer> stack = new Stack<>();


    @Test
    public void testPush() {
        stack.push(1);
        assertEquals(Integer.valueOf(1), stack.get(0));
        assertEquals(1, stack.size());

        stack.push(2);
        assertEquals(Integer.valueOf(2), stack.get(1));
        assertEquals(2, stack.size());

        stack.push(3);
        assertEquals(Integer.valueOf(3), stack.get(2));
        assertEquals(3, stack.size());
    }


    @Test
    public void testPop() {
        stack.push(Integer.valueOf(1));     //0
        stack.push(Integer.valueOf(2));     //1
        stack.push(Integer.valueOf(3));     //2
        stack.push(Integer.valueOf(4));     //3
        stack.push(Integer.valueOf(5));     //4
        stack.push(Integer.valueOf(6));     //5


        assertEquals(Integer.valueOf(6), stack.pop());
        assertEquals(Integer.valueOf(5), stack.pop());
        assertEquals(Integer.valueOf(4), stack.pop());
        assertEquals(Integer.valueOf(3), stack.pop());
    }


    @Test
    public void testPick() {
        stack.push(Integer.valueOf(1));
        stack.push(Integer.valueOf(2));
        stack.push(Integer.valueOf(3));
        stack.push(Integer.valueOf(4));

        assertEquals(stack.get(3), stack.pick());
    }


    @Test
    public void testGet() {
        stack.push(Integer.valueOf(1));
        stack.push(Integer.valueOf(2));
        stack.push(Integer.valueOf(3));
        stack.push(Integer.valueOf(4));

        assertEquals(new Integer(1), stack.get(0));
        assertEquals(new Integer(2), stack.get(1));
        assertEquals(new Integer(3), stack.get(2));
        assertEquals(new Integer(4), stack.get(3));
    }


    @Test
    public void testSize() {
        assertEquals(0, stack.size());

        stack.push(Integer.valueOf(1));
        assertEquals(1, stack.size());

        stack.push(Integer.valueOf(2));
        assertEquals(2, stack.size());

        stack.push(Integer.valueOf(3));
        assertEquals(3, stack.size());

        stack.push(Integer.valueOf(4));
        assertEquals(4, stack.size());

        stack.pop();
        assertEquals(3, stack.size());

        stack.pop();
        assertEquals(2, stack.size());

    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetByInvalidIndex() {
        new Stack<Integer>().get(10);
    }


}