package package_3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread Starting.");

        MyThread mt=new MyThread("Child #1");
       mt.setPriority(10);
        MyThread mt2=new MyThread("Child #2");
        mt2.setPriority(10);
        MyThread mt3=new MyThread("Child #3");
        mt3.setPriority(5);
        MyThread mt4=new MyThread("Child #4");
        mt4.setPriority(1);
        mt.start();
        mt2.start();
        mt3.start();
        mt4.start();
mt4.join();
        System.out.println(mt4.getPriority());



        System.out.println("its dead now.");

        System.out.println("Main Thread Terminating.");
    }
}
