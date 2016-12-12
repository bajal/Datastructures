package lists;

/**
 * Created by Bajal on 12/4/16.
 */
public interface IList<T> {
    public void add(T element);
    public void remove(T element);
    public void insertAfter(T element);
    public void insertBefore(T element);
    public void addMultiple(T... elements);
    public void print();
}
