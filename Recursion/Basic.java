package Recursion;

public class Basic {
    // this function is for printing from 1 to n 
    
    static void printrun(int n){
        if(n>0){
            printrun(n-1); // here we have seen that we are calling the function again and it wont be going 
            // to printing line before executing the function or returning to the main function
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        int a =10;
        printrun(a);
    }
}
