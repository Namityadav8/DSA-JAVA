package Practise;


interface a {
    void show();
}

interface b{
    void show();
}

class c implements a,b{
    public void show(){
        System.out.println("inherited from c's interface");
    }
}
public class diamond {
    public static void main(String[] args) {
        c C = new c();
        C.show();
    }
}
