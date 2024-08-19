package Array;

public class TargetSum {
    public static void main(String[] args) {
        int a[]={1,2,3,4,2,3,2,6,1,4,5};
        int target = 7;
        int pair=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(target == a[i]+a[j]){
                    pair++;
                }
            }
        }
        System.out.println(pair);
    }
}
