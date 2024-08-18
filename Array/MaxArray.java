package Array;

public class MaxArray {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int x=-1;
        int ans=10;
        
        for(int i=0;i<a.length;i++){
            if(a[i]==ans){
                x=i;
            }
        }
        System.out.println("Value found at index "+x);
          
    }
}