package Searching;

import Array.lastoccurence;

public class BinarySearch {

    static boolean sorted(int a[],int target){
        int n = a.length;
        int st=0;
        int end = n-1;
        while(st<=end){
            int mid = (st+end)/2;
            if(target==a[mid]){
                return true;
            }
            
            else if(target<a[mid]){
                end = mid -1;
            }
            else if(target>a[mid]){
                st=mid+1;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println(sorted(a,3));

    }
}
