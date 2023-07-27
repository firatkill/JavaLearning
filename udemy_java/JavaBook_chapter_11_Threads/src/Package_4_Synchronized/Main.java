package Package_4_Synchronized;



public class Main {
    public static void main(String[] args) {

int[] a = new int[]{1, 2, 3, 4, 5};

            MyThread mt1 = MyThread.createAndStart("Child #1", a);
            MyThread mt2 = MyThread.createAndStart("Child #2", a);

            try {
                mt1.thrd.join();
                mt2.thrd.join();
            } catch (InterruptedException exc) {
                System.out.println("Main Thread interrupted.");
            }





 }

}
