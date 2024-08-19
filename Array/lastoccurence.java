package Array;

public class lastoccurence {
    public static void main(String[] args) {
        int a=0;
        int b[]={1,2,3,4,2,23,32,2,23,43,2,345,56,23};
        int c=23;
        for(int i=0;i<b.length;i++){
            if(b[i]==c){
                a=i;
            }
        }
        System.out.println(a);
    }
}
