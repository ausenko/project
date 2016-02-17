import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by zhenya on 17.02.16.
 */
public class QueueTest {

    @Test
    public void testQueue() {
        final Queue<Integer> queue = new Queue<Integer>();

        queue.queue(Integer.valueOf(1));
        assertEquals(Integer.valueOf(1), queue.get(0));
        assertEquals(1, queue.size());

        queue.queue(Integer.valueOf(2));
        assertEquals(Integer.valueOf(2), queue.get(1));
        assertEquals(2, queue.size());
    }


    @Test
    public void testDequeue() {
        final Queue<Integer> queue = new Queue<Integer>();

        queue.queue(Integer.valueOf(1));
        queue.queue(Integer.valueOf(2));

        assertEquals(Integer.valueOf(1), queue.dequeue());
        assertEquals(Integer.valueOf(2), queue.dequeue());
    }


    @Test
    public void testSize() {
        final Queue<Integer> queue = new Queue<Integer>();

        assertEquals(0, queue.size());

        queue.queue(Integer.valueOf(1));
        assertEquals(1, queue.size());

        queue.queue(Integer.valueOf(2));
        assertEquals(2, queue.size());

        queue.dequeue();
        assertEquals(1, queue.size());

        queue.dequeue();
        assertEquals(0, queue.size());
    }
}
