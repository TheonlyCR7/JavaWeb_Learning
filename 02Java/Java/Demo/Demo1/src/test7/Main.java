package test7;

public class Main{
    public static void main(String[] args){
        // 创建Threadl类子类对象
        MyThread mt = new MyThread("super");
        MyThread yt = new MyThread("mid");
        MyThread gt = new MyThread("little");
        // 调用Thread类中的方法start方法， 开启新的线程，执行run方法
        mt.start();
        yt.start();
        gt.start();

//        for(int i = 0; i < 20; i ++){
//            System.out.println("main"+ i);
//        }
    }
}