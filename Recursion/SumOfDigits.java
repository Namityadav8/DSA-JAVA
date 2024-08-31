package Recursion;

public class SumOfDigits {

    static int sod(int n){
        if(n>0 && n<9){
            return n;
        }
        else{
            return sod(n/10)+n%10;
        }
    }
    public static void main(String[] args) {
         int n =23421;
         System.out.println(sod(n));
    }
}
