package Array;

public class SortedArray {
    
    public static void main(String[] args) {
        
         int b[]= {1,2,23,3,5};
         boolean check = true; // so that if there is an empty array which is termed as sorted.
         for(int i=1;i<b.length;i++){
            if(b[i]<b[i-1]){
                check = false;
                break;
            }
         }
         System.out.println(check);
    }
}
