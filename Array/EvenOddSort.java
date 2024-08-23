package Array;

public class EvenOddSort {


    static void swap(int arr[],int i , int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int left = 0;
        int right =a.length -1;
        while (left<right) {
            if(a[left]%2==1 && a[right]%2==0){
                swap(a, left, right);
                left++;
                right--;
            }
            if(a[left]%2==0){
                left++;
            }
            if(a[right]%2==1){
                right--;
            }
    
        }

        


        for(int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
        }
    }
}
