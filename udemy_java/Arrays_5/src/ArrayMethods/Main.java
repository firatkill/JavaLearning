package ArrayMethods;

import java.util.Arrays;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int[] intArr=getRandomArray(10);

        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.binarySearch(intArr,10));
        Arrays.fill(intArr,5);
        System.out.println(Arrays.toString(intArr));
        int[] secondArr=Arrays.copyOf(intArr,5);
        System.out.println(Arrays.toString(secondArr));
        intArr=getRandomArray(10);
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(secondArr));
        secondArr=getRandomArray(15);
        System.out.println(Arrays.toString(secondArr));
        Arrays.sort(secondArr);
        System.out.println(Arrays.toString(secondArr));
    }
    private static int[] getRandomArray(int len){
        Random random=new Random();
        int[] newInt=new int[len];
        for(int i=0;i<len;i++) {
            newInt[i]=random.nextInt(100);
        }
        return newInt;

    }
}