package package_1_Try_this;

public class Main {
    public static void main(String[] args) {
      Integer[] iStore=new Integer[10];

      GenQueue<Integer> q= new GenQueue<>(iStore);

      Integer iVal;

        System.out.println("Demonstrate a queue for Integers. ");

        try{
            for(int i=0;i<5;i++){
                System.out.println("Adding "+i+" to q. ");
                q.put(i);
            }
        }catch(QueueFullException exc){
            System.out.println(exc);
        }

        System.out.println();


        try{
            for(int i=0;i<5;i++){
                System.out.println("Getting next Integer from q:");
                iVal=q.get();
                System.out.println(iVal);
            }
        }catch (QueueEmptyException exc){
            System.out.println(exc);
        }
        ;


    }
}