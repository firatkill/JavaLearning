import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] scannedInts=readIntegers();
        int min=findMin(scannedInts);
        System.out.println(min);
    }
    public static int[] readIntegers(){
        Scanner scanner=new Scanner(System.in);
        String numString= scanner.nextLine();

        String[] numArr= numString.split(",");

        int[] returnArr= new int[numArr.length];
        for(int i=0;i<numArr.length;i++){
            if(numArr[i].trim()!=""){
                returnArr[i]=Integer.parseInt(numArr[i].trim());
            }
        }

        return returnArr;
    }
    public static int findMin(int... arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr[0];
    }
}
