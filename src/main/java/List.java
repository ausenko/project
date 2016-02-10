import org.w3c.dom.html.HTMLDListElement;

/**
 * Created by Anton on 05.02.16.
 */
public class List<T> {
    private Node<T> head;  // указатель на первый элемент;
    private Node<T> tail;  // указатель на последний элемент;
    private int size;


    public void add(T item) {
        final Node<T> x = new Node<T>(item);

        if (head == null) {
            head = x;
            tail = x;
            x.setNext(head);
        } else {
            tail.setNext(x);
            tail = x;
        }
        size++;
    }


    public void remove(T item) {
        if (head == null) {
            throw new IllegalStateException("List doesn't have elements");
        }

        if (head.getData().equals(item)) {
            head = head.getNext();
            return;
        }

        Node<T> t = head;
        Node<T> findvalue = t.getNext();
        while (t.getNext() != null) {
            if (t.getNext() == item) {
                if (tail == t.getNext()) {
                    tail = t;
                }
                findvalue = t.getNext();
                return;
            }
            t = t.getNext();

        }
    }


    public void remove(int index) {
        if (index >= size) {
            throw new IllegalArgumentException("Invalid index=" + index + ", list size=" + size);
        }

        Node<T> tmp = head;
        Node<T> findvalue = tmp.getNext();
        for (int i = 0; i < size; i++) {
            if (i != index) {
                tmp = tmp.getNext();
                i++;
            } else {
                head = head.getNext();
                findvalue = tmp.getNext();
            }
        }
    }


    public T get(int index) {
        if (index >= size) {
            throw new IllegalArgumentException("Invalid index=" + index + ", list size=" + size);
        }

        Node<T> tmp = head;
        for (int i = 0; i < size; i++) {
            if (i == index) return tmp.getData();
            tmp = tmp.getNext();
        }
        throw new IllegalStateException("Unreachable statement");
    }

    public int size() {
        return size;
    }


}
