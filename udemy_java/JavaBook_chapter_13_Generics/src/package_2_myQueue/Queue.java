package package_2_myQueue;



public class Queue<T> implements IQueue<T>{
    private int putloc,getloc;
    private T[] Q;

    Queue(T[] queue){
        Q=queue;
        putloc=getloc=0;
    }
    @Override
    public void put(T val) throws QueueFullException {
        if(putloc==Q.length){
            throw new QueueFullException(Q.length);
        }
        Q[putloc++]=val;
    }

    @Override
    public T get() throws QueueEmptyException {
        if(putloc==0){
            throw new QueueEmptyException();
        }return Q[getloc++];
    }
}
