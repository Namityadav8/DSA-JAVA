package Recursion;

public class Pow {

    static int pow(int p , int q){
        if(q==0){
            return 1;
        }else{
            return p*pow(p,q-1);
        }
    }
    public static void main(String[] args) {
        int a = pow(3,3);
        System.out.println(a);
    }
}
