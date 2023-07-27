package package_1;

public class MyThread implements Runnable{
    String name;
   MyThread(String name){
       this.name=name;
   }

    @Override
    public void run() {
        System.out.println(this.name+"running ");
        try{
            for(int count=0;count<10;count++){
                Thread.sleep(400);
                System.out.println("In "+this.name+", count is "+count);
            }
        }catch (InterruptedException exc){
            System.out.println(this.name+" interrupted.");
        }
        System.out.println(this.name+ " terminating..");
    }
}
