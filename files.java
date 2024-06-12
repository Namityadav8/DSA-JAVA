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
        // try{
        // FileWriter fw = new FileWriter(a);
        // fw.write("Hi this is namit yadav");
        // fw.close();
        // }catch(Exception e){}
        // finally{System.out.println("Written something in the file ");}

        // now reading what is written in a file
        try{
        Scanner sc = new Scanner(a);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        }catch(Exception e){}

        a.delete(); // used for deleting the file 
    }
}
