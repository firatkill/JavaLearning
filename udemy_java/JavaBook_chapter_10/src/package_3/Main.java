package package_3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main  {
    public static void main(String[] args) throws IOException {

        FileReader fr=new FileReader("SomeText.txt");
        FileWriter fw=new FileWriter("SomeTextCopy.txt");
        char tempch;
        ArrayList<Character> tempArr=new ArrayList<>();
        ArrayList<String> strArr=new ArrayList<>();
        String tempStr="";
        int tempint;
        do{
         tempint=fr.read();
         tempch=(char) tempint;

             if(tempch!=' '){
                 tempArr.add(tempch);
             }else{

                 for(char ch : tempArr){
                 tempStr+=ch;
                 }
                 strArr.add(tempStr+" ");
                 tempArr.clear();
                 tempStr="";
             }
        }while(tempint!=-1);
        for(String str:strArr){

           if(!str.trim().equalsIgnoreCase("david")) fw.write(str);

        }
        fw.close();
        fr.close();
    }
}
