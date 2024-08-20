package Array;

public class Value_Repeating {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,45,3};
        int ans=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    ans=a[i];
                    break;
                    
                }else{
                    ans=-1;
                }
            }
        }
        System.out.println(ans);
    }
}
