package Array;

public class Occurences {
    public static void main(String[] args) {
         int a=0;
         int b[]= {1,2,3,4,2,45,23,2,34,23,3,2};
         int c=23;
         for(int i=0;i<b.length;i++){
            if(b[i]==c){
                a++;
            }
         }
         System.out.println(a);
    }
}
