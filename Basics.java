import java.util.*;
interface a{
    public void fun(String a);
}


public class Basics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String b = sc.nextLine();
        a aa = (String a)->{
            System.out.println("HELLO MF "+a);
        };
        aa.fun(b);
    }
}