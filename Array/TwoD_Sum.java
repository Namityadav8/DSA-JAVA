package Array;

public class TwoD_Sum {
    public static void main(String[] args) {
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];

        int sum[][]=new int[3][3];
        // just make sure first that size of a and b is equal 
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<sum[i].length;j++){
                sum[i][j]=a[i][j] + b[i][j];
            }
        }


        //almost complete just have to give values to a and b and its done 
    }
}
