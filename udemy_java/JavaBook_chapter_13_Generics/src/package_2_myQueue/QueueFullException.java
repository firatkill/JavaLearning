package package_2_myQueue;

public class QueueFullException extends Exception {
    private int length;
    QueueFullException(int length){
        this.length=length;
    }

    public String toString(){
        return "Queue is full. current size is: " +this.length;
    }


}
