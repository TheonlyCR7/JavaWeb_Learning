package test8;

public class Demo {
    public static void main(String[] args) {
        MyRunable mr = new MyRunable();
        Thread t = new Thread(mr, "bob");
        t.start();
    }
}
