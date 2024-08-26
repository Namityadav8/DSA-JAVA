package Array;

public class Trasnpose {
    public static void main(String[] args) {
        

        int a[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        int x = a.length;
        int y=a[0].length;
        int b[][]=new int[y][x];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                b[j][i]=a[i][j];
            }
        }

        System.out.println("Transposed array :");

        
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
