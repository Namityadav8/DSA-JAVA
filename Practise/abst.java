package Practise;

class test{
    private String name ;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name ;
    }

}
public class abst {
    public static void main(String[] args) {
        test c = new test();
        c.setName("MAmoit");
        System.out.println(c.getName());
    }
}
