package Sorting;

public class BubbleSort {

    static int[] BubbleSort1(int a[]){

        int n =a.length;
        for(int i=0;i<n-1;i++){ // it is used for the number of iterations or you can say number of elements at right place 
            for(int j=0;j<n-i-1;j++){   // it is used for swapping numbers 
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        
        int a[] = {3,4,2,5,1};
        int b[] = BubbleSort1(a);
        for(int i : b){
            System.out.println(i);
        }
    }
}
