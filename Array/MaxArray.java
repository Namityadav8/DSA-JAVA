package Array;

import java.util.Arrays;

public class MaxArray {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int b[];
        // cloning the elements of first array into another array.
        // b=a.clone();
        // b=Arrays.copyOf(a, 3);
        b=Arrays.copyOfRange(a, 0, 4); // also a method of copying array but to a particular range 
        
        // another way of cloning array but upto a particular length 
        // int x=-1;
        // int ans=10;
        
        // for(int i=0;i<a.length;i++){
        //     if(a[i]==ans){
        //         x=i;
        //     }
        // }
        // System.out.println("Value found at index "+x);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
          
    }
}