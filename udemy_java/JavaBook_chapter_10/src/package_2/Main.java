package package_2;

import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String str;
      do {
          str = br.readLine();
          System.out.println(str);
      }while(!str.equalsIgnoreCase("stop"));

    }


}
