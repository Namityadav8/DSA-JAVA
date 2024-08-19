package Array;

import java.util.Arrays;

public class Larg_small_array {
    public static void main(String[] args) {
        int b[]= {1,2,23,3,5};
        boolean check = true; 
        for(int i=1;i<b.length;i++){
           if(b[i]<b[i-1]){
               check = false;
               break;
           }
        }
        int x[]={b[0],b[b.length-1]};
        System.out.println(x);
// sorting array using inbuilt array library.
        // Arrays.sort(b);
        // for(int i=0;i<b.length;i++){
        //     System.out.println(b[i]);
        // }
    }
}
