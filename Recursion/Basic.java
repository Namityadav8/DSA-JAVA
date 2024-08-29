package Recursion;

public class Basic {
    static void printrun(int n){
        if(n>0){
            printrun(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        int a =10;
        printrun(a);
    }
}
