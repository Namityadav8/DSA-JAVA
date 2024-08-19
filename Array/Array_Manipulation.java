package Array;

public class Array_Manipulation {
    public static void main(String[] args) {
        int unique=0;
        int a[]={1,2,3,4,2,1,3,5,5,23,32,21};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
        
                }else{
                    unique=a[j];
                }
            }
        }
        System.out.println(unique);
    }
}
