package Practise;

class A extends Thread {
    @Override
    public void run() {   // Must override run()
        System.out.println("this is thread class");
    }
}

public class thread {
    public static void main(String[] args) {
        A aa = new A();
        aa.start();  // internally calls run()
    }
}
