package test8;

public class WaitingTest {
    // 先创建这个obj锁对象
    public static Object obj = new Object();
    public static void main(String[] args) {
        // 演示waiting
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) { // 锁控制
                        try {
                            System.out.println(Thread.currentThread().getName() + "=== 获取到锁对象，调用wait方法，进入waiting状态，释放锁对象");
                            obj.wait(); // 无限等待
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "=== 从waiting状 态醒来，获取到锁对象，继续执行了");
                    }
                }
            }
        }, "等待线程").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){ //每隔3秒 唤醒一次
                    try {
                        System.out.println( Thread.currentThread().getName() +"‐‐‐‐‐ 等待3秒钟");
                        Thread.sleep(3000);
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        System.out.println( Thread.currentThread().getName() +"‐‐‐‐‐ 获取到锁对 象,调用notify方法，释放锁对象");
                        obj.notify(); // 释放锁对象
                    }
                }
            }
        },"唤醒线程").start();
    }
}
