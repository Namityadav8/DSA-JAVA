class a {
    private int a ;
    public void getNum(){
       System.out.println("The value chosen is "+a);
    }

    public void setNum(int a){     
        this.a = a;
        
    }
}
public class getset {
    public static void main(String[] args) {
        a  aa = new a();
        aa.setNum(34);
        aa.getNum();
    }
}
