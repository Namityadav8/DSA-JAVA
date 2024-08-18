package Array;

public class MaxArray {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int b=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>b){
                b=a[i];
            }
        }
        System.out.println(b);
    }
}