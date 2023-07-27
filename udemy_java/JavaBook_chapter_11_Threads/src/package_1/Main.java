package package_1;

public class Main {
    public static void main(String[] args) throws InterruptedException {

       MyThread thr=new MyThread("sth");

       Thread thr2=new Thread(new MyThread("somename"),"myThread");
        System.out.println(thr2.getName());


    }
}