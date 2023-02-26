package com.atguigu.java;


/*
 * 例子：创建三个c窗口卖票，总票数为100张:使用继承Thread类的方式
 *
 *  使用同步代码块解决继承Thread类的方式的线程安全问题
 *
 *
 * */
class Window2 extends Thread {

    private static int ticket = 1000;
    private static Object obj = new Object();

    @Override
    public void run() {

        while (true) {
//            synchronized (obj) {
            synchronized (Window2.class) {

                if (ticket > 0) {

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println(getName() + ":卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }

    }
}

public class WindowTest2 {
    public static void main(String[] args) {
        Window2 t1 = new Window2();
        Window2 t2 = new Window2();
        Window2 t3 = new Window2();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

