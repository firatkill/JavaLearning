package package_1_Try_this;

public class GenQueue<T> implements IGenQ<T>{

    private T[] q;
    private int putloc,getloc;

    public GenQueue(T[] aRef){
        q=aRef;
        putloc=getloc=0;
    }



    @Override
    public void put(T obj) throws QueueFullException {

        if(putloc==q.length){
            throw new QueueFullException((q.length));
        }

        q[putloc++] = obj;

    }

    @Override
    public T get() throws QueueEmptyException {
      if(getloc==putloc){
          throw new QueueEmptyException();
      }
      return q[getloc++];


    }
}
