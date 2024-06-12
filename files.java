import java.io.*;
import java.util.*;
public class files {
    public static void main(String[] args) {
        File a = new File("abc.txt");
        try{
            a.createNewFile();
        }catch(Exception e){}
        finally{System.out.println("FILE created.");}

        // now writing in this file 
        try{
        FileWriter fw = new FileWriter(a);
        fw.write("Hi this is namit yadav");
        fw.close();
        }catch(Exception e){}
        finally{System.out.println("Written something in the file ");}
    }
}
