import java.util.*;


class a<T>{
    
    public T fun(T b){
        System.out.println(b);
        return b;
    }
}

public class getset {
    public static void main(String[] args) {
       a<Integer> obj = new a<>();
       obj.fun(23);
    }
}
