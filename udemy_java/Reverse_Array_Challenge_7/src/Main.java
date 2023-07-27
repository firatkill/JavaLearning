import java.util.Arrays;

public class Main {
    public static void main(String[] args) {/*
        int[] myArr={1,2,3,4,5,10,5,4,1};
        System.out.println(Arrays.toString(reverseIt(myArr)));*/
        int[][] intArr=new int[3][3];
        System.out.println(Arrays.toString(intArr));
    }
    public static int[] reverseIt(int... nums){
        int[] resultArr=new int[nums.length];
        int[] tempArr= Arrays.copyOf(nums,nums.length);


        for(int i=0;i<nums.length;i++){
            resultArr[i]=tempArr[nums.length-i-1];
        }

        return resultArr;
    }
}
