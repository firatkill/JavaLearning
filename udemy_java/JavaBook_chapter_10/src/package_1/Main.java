package package_1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {


        FileReader fr=new FileReader("SomeText.txt");
        FileInputStream fin=new FileInputStream("SomeText.txt");
        FileOutputStream fout=new FileOutputStream("SomeText.txt");
int i=0;

        char[] str=new char[]{'a','b','c','d'};

        for(char ch:str){
            fout.write((byte)ch);
        }

        while(i!=-1){
            i=fin.read();
            System.out.println((char)i);
        }
fin.close();
        fout.close();


    }
}