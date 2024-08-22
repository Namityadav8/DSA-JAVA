package Array;

public class Rotate_Array_KSteps {

    static void  Array1(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
    static void KRotated(int a[],int k){
        
        int j=0;
        int n = a.length;
        int ans[]=new int[n];
        k=k%n;
        for(int i=n-k;i<n;i++){
            ans[j++]=a[i];  // Here it is done to get the first side of rotated array
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=a[i];
        }
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
        
        
    }
    public static void main(String[] args) {
        int arr[]={1,23,4,5,6};
        int n=3;
        KRotated(arr, n);
    }
}
