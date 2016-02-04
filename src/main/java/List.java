
/**
 * Created by Anton  on 04.02.16.
 */
public class List<T> extends Node<T> {

    private static final int DEFAULT_CAPACITY = 10;

    private T t[] = (T[]) new Object[DEFAULT_CAPACITY];
    private static int index = 0;


    public List(T data, Node<T> prev, Node<T> next) {
        super(data, prev, next);
    }

    public List(T data, Node<T> prev) {
        super(data, prev);
    }

    public List(T data) {
        super(data);
    }

    public List() {
        super();
    }


    public void add(T item) {
        validate(item);
        if (index <= t.length) {
            provideNew();
        }
        index++;
        t[index] = item;
    }

    public void remove(T item) {
        validate(item);
        for (int i = 0; i < t.length; i++) {
            if (item == t[i]) {
                index--;
                shiftLeft(i);
            }
        }
    }

    public void remove(int index) {
        validate(index);
        this.index--;
        shiftLeft(index);
    }

    public T get(int index) {
        validate(index);
        return t[index];
    }

    public int size() {
        return t.length;
    }

    public void provideNew() {
        T[] newArray = (T[]) new Object[index * 2];
        for (int i = 0; i < t.length; i++) {
            newArray[i] = t[i];
        }
        t = newArray;
    }

    public void shiftLeft(int index) {
        for (int i = index; i < t.length; i++) {
            if (t[i + 1] != null)
                t[i] = t[i + 1];
        }
    }

    public void validate (T t){
        if(t == null){
            throw new NullPointerException();
        }
    }

    public void validate(int index) {
        if (index < 0 || index > this.index) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }




}
