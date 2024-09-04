package Sorting;

/**
 * InsertionSort
 */
public class InsertionSort {
    static void sorting(int[]a){
        int n =a.length;
        for(int i=1;i<n;i++){
            int j =i;
            while(j>0 && a[j]<a[j-1]){
                int temp = a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int b[]={3,2,4,7,6,8};
        sorting(b);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}