/**
 * Created by Anton on 11.02.16.
 */
public class Stack<T> {

    private Node<T> head;
    private int size;


    public void push(T item) {
        head = new Node<>(item, head);
        size++;
    }


    public T pop() {
        if (head == null) {
            throw new IllegalStateException("Stack doesn't have elements");
        }

        T findvalue = (T) head.getNext();
        findvalue = (T) head;
        size--;
        return (T) head;
    }


    public T pick() {

        T top = (T) head.getData();
        if (top == null) {
            throw new IllegalStateException("Stack doesn't have elements");
        } else {
            return top;
        }

    }


    public T get(int index) {
        if (index >= size) {
            throw new IllegalArgumentException("Invalid index=" + index + ", stack size=" + size);
        }
        Node<T> tmp = head;
        for (int i = size() - 1; i >= 0; i--) {
            if (i == index) {
                return tmp.getData();
            }
            tmp = tmp.getPrev();
        }
        throw new IllegalStateException("Unreachable statement");
    }


    public int size() {
        return size;
    }
}











