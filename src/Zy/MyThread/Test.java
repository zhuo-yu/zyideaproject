package Zy.MyThread;

public class Test {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
        Thread t1=new Thread(new MyRunnable());
        t1.start();
    }
}
