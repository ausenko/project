/**
 * Created by Anton on 04.02.16.
 */
public class Node<T> {

    /**
     * Reference to the prev. item in the chain, can be {@code null} in case of no
     * such reference.
     */
    private Node<T> prev;


    /**
     * Reference to the next. item in the chain, can be {@code null} in case of no
     * such reference.
     */
    private Node<T> next;
    /**
     * Actual data of the current item in the chain.
     */
    private T data;


    public Node(T data, Node<T> prev, Node<T> next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }


    public Node(T data, Node<T> prev) {
        this(data, prev, null);
    }


    public Node(T data) {
        this(data, null, null);
    }

    public Node() {

    }


    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getData(T data) {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
