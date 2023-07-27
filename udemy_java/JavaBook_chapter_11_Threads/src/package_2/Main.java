package package_2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread Starting.");

        //create and start a thread.
       // MyThread mt= MyThread.createAndStart("Child #1");
        MyThread newMt=new MyThread("thread");



        newMt.run();

        newMt.run();
        System.out.println("Main Thread ending.");
    }
}
