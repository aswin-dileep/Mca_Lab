//program to read a file

import java.io.*;

public class fileread{
    public static void main(String[] args){
        try{
            FileReader r = new FileReader("hello.tx");
            BufferedReader br = new BufferedReader(r);
            String line = br.readLine();
            while(line!=null){
                System.out.println(line);
                line=br.readLine();
            }
            
        }catch(IOException e){
            System.out.println(e);
        }
    }
}