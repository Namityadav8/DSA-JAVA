package Array;

public class PrefixSum {

    static int[] printArray(int[]a){
        int n =a.length;
        
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        return a; // since this is an array method 
    }

    static int[] prefixSum(int[]b){
        int x = b.length;
        int pref[]=new int[x];
        pref[0] = b[0];
        for(int i=1;i<x;i++){
            pref[i]=pref[i-1]+b[1];
        }
        return pref;
    }
    public static void main(String[] args) {
            
        int a[] = {1,2,3,5,6};
        int m[]=prefixSum(a);
        int n[]=printArray(a);
        System.out.println();
        int x[] = printArray(m);

    }
}
