package Array;

public class Largest {
    public static void main(String[] args) {
        int a = Integer.MIN_VALUE;
        int b[]={1,23,13,243,13,43,13,534,4234};
        for(int i=0;i<b.length;i++){
            if(b[i]>a){
                a=b[i];
            }
        }
      
    }
}
