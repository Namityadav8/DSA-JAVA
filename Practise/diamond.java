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
        try{
            System.out.println(0/1);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("Nothing i want to print just for fun");
        }
    }
}
