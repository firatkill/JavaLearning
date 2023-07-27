package package_2_myQueue;

import java.sql.SQLInput;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Integer[] arr=new Integer[10];
        Double[] arr2=new Double[10];
       String[] arr3=new String[10];
        Queue<Double> myQueue2=new Queue<>(arr2);
        Queue<Integer> myQueue=new Queue<>(arr);
        Queue<String> myQueue3=new Queue<>(arr3);
Queue myQueue4=new Queue<>(arr3);
    

        try{
            for(int i=0;i<15;i++){
                myQueue3.put("Something");
            }
        }catch(Exception exc){
            System.out.println(exc);
        }


        try{
            for(int i=0;i<10;i++){
                System.out.println(myQueue3.get());
            }
        }catch(Exception exc){
            System.out.println(exc);
        }



    }
}
