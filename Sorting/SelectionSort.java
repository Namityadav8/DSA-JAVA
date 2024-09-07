
public class SelectionSort {

    

    static int[] sorting(int a[]){
        int n = a.length;

        for(int i=0;i<n-1;i++){
            int minindex=i;        // selecting an index to be the minimun at first 

            for(int j=i+1;j<n;j++){
                if(a[j]<a[minindex]){ // condition to sort in increasing or decreasing
                    minindex=j;     //updating the minmum element after comparing
                }
            }
            int temp=a[i];
            a[i]=a[minindex];
            a[minindex]=temp; // putting smallest number at its place 
            
        }
        return a;
    }
    public static void main(String[] args) {
        int a[]={4,2,14,1,34,6,9};
        int b[]=sorting(a);
        for(int i=0;i<b.length-1;i++){     //printing the sorted array 
            System.out.println(b[i]);
        }
    }
}
