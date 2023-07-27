package SortArrays;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] myArray=getRandomArray(10);
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
        int[] newArray=new int[myArray.length];
        for(int i=myArray.length-1;i>=0;i--){
            newArray[myArray.length-i-1] =  myArray[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
    public static int[] getRandomArray(int len){
        Random random=new Random();
        int[] tempInt = new int[len];
        for(int i=0;i<len;i++){
            tempInt[i]=random.nextInt(100);
        }
        return tempInt;
    }
}
