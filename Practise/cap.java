package Practise;
import java.util.*;
public class cap {

    public static boolean isprime(int n){
        boolean result = true;
        if(n<1){
            result = false;
        }else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    result= false;
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println(isprime(a));



        
    }
}
