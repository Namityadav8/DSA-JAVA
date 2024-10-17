package Searching;

public class TargetRotatedArray {
    static int rotatedArrayfun(int a[],int target){
        int n = a.length;
        int st=0;
        int end = n-1;
        while(st<=end){
            int mid = (st+end)/2;
            if(a[mid]==target){
                return mid;
            }
            else if(a[mid]<a[end]){
                if(target>a[mid] && target<a[mid]){
                    st=mid+1;
                }else{
                    end=mid-1;
                }
            }
            else {
                if(target>a[st] && target<a[mid]){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={4,5,6,7,8,1,2,3};
        int target=4;
        System.out.println(rotatedArrayfun(a, target));
    }
}
