package com.atguigu.java;

/*
 *
 * 使用同步方法处理继承Thread类的方式中的线程安全问题
 *
 *
 *  关于同步方法的总结：
 *  1.同步的方法仍然涉及到同步监视器，只是不需要我们显式的声明
 *  2.非静态的同步方法，同步监视器是：this
 *    静态的同步方法，同步监视器是：当前类本身
 *
 * */
class Window4 extends Thread {

    private static int ticket = 1000;


    @Override
    public void run() {

        while (true) {
            show();
            if (ticket == 0) {
                break;
            }
        }
    }

    //    private synchronized void show() {//同步监视器t1,t2,t3
    private static synchronized void show() {//同步监视器：Window4.class

        if (ticket > 0) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
            ticket--;
        }
    }
}

public class WindowTest4 {
    public static void main(String[] args) {
        Window4 t1 = new Window4();
        Window4 t2 = new Window4();
        Window4 t3 = new Window4();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
