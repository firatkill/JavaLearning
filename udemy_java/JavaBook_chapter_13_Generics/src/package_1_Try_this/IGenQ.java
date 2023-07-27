package package_1_Try_this;

public interface IGenQ<T> {

    void put(T ch) throws QueueFullException;
    T get() throws QueueEmptyException;

}
