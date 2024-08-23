package Array;

public class Array0and1 {

    static void swap(int arr[],int i , int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int a[]={1,0,1,1,0,0,0,1,0};
        int n = a.length;
        int x=0;
        int y=n-1;
        while(x<y){
            if(a[x]==1 &&a[y]==0){
                swap(a,x, y);
                x++;
                y--;
            }

            if(a[x]==0){
                x++;
            }
            if(a[y]==1){
                y--;
            }
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
