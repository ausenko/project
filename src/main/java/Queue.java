/**
 * Created by zhenya on 17.02.16.
 */
public class Queue<T> {

    private Node<T> tail;// указатель на конец очереди
    private Node<T> head;// указателель на начало очереди
    private int size;


    public void queue(T data) {
        final Node<T> x = new Node<T>(data);

        if (tail == null) {
            tail = x;
            head = x;
        } else {
            tail.setNext(x);
            tail = x;
        }
        size++;
    }


    public T dequeue() {
        if (head == null) {
            throw new IllegalArgumentException("Queue doesn't have elements");
        }

        final T data = head.getData();
        size--;

        if (size == 0) {
            head = null;
            tail = null;
        } else {
            head = head.getNext();
        }
        return data;

    }


    public T get(int index) {
        if (index >= size) {
            throw new IllegalArgumentException("Invalid index=" + index + ", queue size=" + size);
        }

        Node<T> tmp = head;
        for (int i = 0; i < size; i++) {
            if (i == index) return tmp.getData();
            tmp = tmp.getNext();
        }
        throw new IllegalArgumentException("Unreachable statement");
    }


    public int size() {
        return size;
    }
}
