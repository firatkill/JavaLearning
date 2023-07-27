package package_1;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
    String anyString="SomeName";
     printReversed("Fırat",4);
        System.out.println();
     printReversed(anyString,anyString.length()-1);


    }
    public static String printReversed(String original,int index){
        System.out.print(original.charAt(index));
        if(index>0) printReversed(original,index-1) ;

        return "";


    }
}