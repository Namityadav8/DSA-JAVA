package Array;

public class SecondLargest {
    public static void main(String[] args) {
        int a = Integer.MIN_VALUE;
        int cd = Integer.MIN_VALUE;
        int b[]={23,112,241,456,123,623,432 ,34,436,34,342};
        for(int i=0;i<b.length;i++){
            if(b[i]>a){
                a=b[i];
            }
        }
        for(int i=0;i<b.length;i++){
            if(b[i]>cd && b[i]<a){
               cd=b[i];
        }
    }
        
        
        // for(int i=0;i<b.length;i++){
        //     if(b[i]==a){
        //         b[i]=Integer.MIN_VALUE;
        //     }
        // }
       
        // for(int i=0;i<b.length;i++){
        //     if(b[i]>a){
        //         a=b[i];
        //     }
        // }
        
        System.out.println("Second largest is : "+cd);
    }
}
