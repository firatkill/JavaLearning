/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javabook;
import java.util.*;
import java.io.IOException;

/**
 *
 * @author firatmacbook
 */
public class JavaBook {

    public static void main(String[] args) throws IOException {
     /*   int myVar1;
        int myVar2;
        
        myVar1=1024;
        System.out.println("myVar1 contains: " + myVar1);
        
        myVar2=myVar1/2;
        
        System.out.print("myVar2 contains myVar1/2 : ");
        System.out.println(myVar2);
        
        */
     /* 
     int v;
     double x;
     
     v=10;
     x=10.0;
     
     System.out.println("Original value of v: "+v);
     System.out.println("Original value of x: "+x);
        System.out.println();
        v=v/4;
        x=x/4;
    System.out.println("v after division: " + v);
    System.out.println("x after division: " + x);
    
*/
//     double x,y,z;
//     x=3;
//     y=4;
//     z=Math.sqrt(x*x+y*y);
//     System.out.println("Hypotenuse is "+z);
//     
//     
//
//char ch;
//ch='x';
//System.out.println("ch first value: "+ch);
//
//ch++;
//System.out.println("ch second value: "+ch);
//
//ch=90;
//System.out.println("ch third value: "+ch);
//   



//boolean b;
//
//b=false;
//        System.out.println("b is "+b);
//
//        b=true;
//        System.out.println("b is " +b); 
//        
//        // a bool value can control the if statement
//        
//        if(b) System.out.println("this is executed");
//        
//        
//        b=false;
//        if(b) System.out.println("this is not executed");
//        
//        
       
     //   soundCalculator(7.2);


//int a=123_456_789;
//System.out.println("a is "+a);

//long a=0b1100;
//        System.out.println("a is "+a);
//


//char ch='\t';
//System.out.println("ch is "+ch);


//System.out.println("first line\nsecond line");
//System.out.println("A\tB\tC");
//System.out.println("D\tE\tF");

//int b=1;
//System.out.println(b);

//boolean b,q;
//b=q=true;
//
//System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
//System.out.println(b+"\t"+q+"\t"+(b&q)+"\t"+(b|q)+"\t"+(b^q)+"\t"+(!b));
//
//q=false;
//System.out.println(b+"\t"+q+"\t"+(b&q)+"\t"+(b|q)+"\t"+(b^q)+"\t"+(!b));
//
//b=false;
//q=true;
//System.out.println(b+"\t"+q+"\t"+(b&q)+"\t"+(b|q)+"\t"+(b^q)+"\t"+(!q));
//
//q=false;
//System.out.println(b+"\t"+q+"\t"+(b&q)+"\t"+(b|q)+"\t"+(b^q)+"\t"+(!q));

//byte b;
//int i;
//
//b=10;
//i=b*b;
//
//System.out.println("i is: "+i+";\t b is: "+b);
//
//b= (byte) (b*b);
//        System.out.println("b is: "+b);


        //primeFinder(100);
        

//int ch;
//System.out.println("Press a key followed by ENTER");
//
//ch= System.in.read();
//
//System.out.println("The keycode of the key you pressed is: "+  ch);
//

//char readed;
//
//        do {System.out.println("The program takes your input until you press q ");    
//            readed= (char) System.in.read();
//            
//        } while (readed!='q');
//        
//
//

    
    
    // for(int i=1000;i>=0;i-=2) System.out.println(i); 
    
//    int a;
//    a=System.in.read();
//    
//    System.out.println("what you write is: "+ (char)(a-32));
//   (MAKE CHAR UPPERCASE)  
//    
    
//    Vehicle car=new Vehicle(4, 42, 6);
//    
//    System.out.println("The car has "+car.getSeatNumber()+" seats, and "+car.getWheels()+" wheels.");
//  
//    
//    car.setSeatNumber(12);
//    System.out.println(car.getSeatNumber());
//    
//         
  

//int sample[] = new int[10];
//
//
//for(int i=0;i<sample.length;i++){
//System.out.print(sample[i]);
//
//}
//System.out.print("\n");
//for(int i=0;i<sample.length;i++){
//sample[i]=i;
//}
//for(int i=0;i<sample.length;i++){
//System.out.print(sample[i]);
//}

//
//int num[]={1,2,3,4,5,6,7,8,9};
//
//    System.out.println(miniFinder(num));
//    System.out.println(maxiFinder(num));
//
//

//char ch;
//ch='a';
//System.out.println((char) (ch -32)); //make a letter uppercase
//
//System.out.println((char) (ch&65503)); //make a letter uppercase by turning the 4. bit off.
//
//System.err.println((char)(ch|32)); //make a letter lowercase by turning the 4. bit on.

//32 is 0000 0000 0010 0000 in binary and 65503 is 1111 1111 1101 1111. 


//binaryConverter(-34);
//binaryConverter(34);
//binaryConverter(~34); // ~sign reverts all the bits.

//Scanner scan=new Scanner(System.in);
//
////int a=scan.nextInt();
//String b=scan.nextLine();
//scan.close();
////System.out.println("Scanned number: "+a);
//System.out.println("Scanned line: "+b);


//Stack stack=new Stack(30);
//
//for(int i=2;i<=60;i+=2){
//stack.push(i);
//}
//stack.pop();
//stack.pop();
//stack.push(58);
//stack.push(60);
//
//for(int i=0;i<30;i++){
//System.out.println(stack.getArray()[i]);
//}


String str="naber";




    }
     
    
    
    public static void soundCalculator(double time){
        System.out.println( "the lighting is "+time*1100+" feet away.");
    }
    
    
    public static void primeFinder(int edge){
        for(int i=2;i<=edge;i++){
            boolean temp=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    temp=false;
                }
            }if(temp){
                System.out.println(i);
            }
        }
    }
    
    public static int miniFinder(int num[]){
        
        int mini=num[0];
        
        for(int i=0;i<num.length;i++){
        
            if(num[i]<mini){
            mini=num[i];}
        
        }
        
        return mini;
    }
    public static int maxiFinder(int num[]){
    
        int maxi=num[0];
        
        for(int i=0;i<num.length;i++){
        if(num[i]>maxi) maxi=num[i];
        
        }
        return maxi;
        
    }
    
    
    public static void binaryConverter(int a){
        System.out.println("The given integer is: "+a +"\n");
        System.out.print("The binary result is:");
        for(int t=128;t>0;t/=2){
        if((a&t)!=0){
        System.out.print("1");
        }else{System.out.print("0");}
        }
    
    }
    
 
    
    
    
}
