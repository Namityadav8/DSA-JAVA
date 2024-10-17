package Searching;

public class RotatedBinarySearch {

    static int rotatedArray(int a[]){
        int ans=-1;
        int n = a.length;
        int st=0;
        int end=n-1;
        
        while(st<=end){
            int mid = (st+end)/2;
            if(a[mid]<=a[n-1]){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int a []={1,2,3,4,5,7,8};
        System.out.println(rotatedArray(a));
    }
}
