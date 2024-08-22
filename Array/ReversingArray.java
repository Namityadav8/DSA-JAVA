package Array;

public class ReversingArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[] = new int[5];
        int j=0;
        for(int i=a.length-1;i>=0;i--){
            b[j++]=a[i];
           
        }
        for(int i=0;i<a.length;i++){
            System.out.println(b[i]);
        }
    }
}
