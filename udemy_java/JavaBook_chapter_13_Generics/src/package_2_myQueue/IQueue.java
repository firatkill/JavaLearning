package package_2_myQueue;



public interface IQueue<T> {
    void put(T val) throws QueueFullException;
   T get() throws QueueEmptyException;
}
