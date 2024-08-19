package Array;

public class striclygreater {
    public static void main(String[] args) {
        int a=5;
        int b[]= {1,2,3,4,2,45,23,2,34,23,3,2};
        int c=0;
         for(int i=0;i<b.length;i++){
            if(b[i]>a){
                c++;
            }
         }
         System.out.println(c);
    }
}
