package com.atguigu.java;

/*
 *
 * 使用同步方法解决实现Runnable接口线程安全问题
 *
 *
 * */


class Window3 implements Runnable {

    private int ticket = 1000;

    @Override
    public void run() {
        while (true) {
            show();
            if (ticket == 0) {
                break;
            }
        }
    }

    private synchronized void show() {//同步监视器：this
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


public class WindowTest3 {
    public static void main(String[] args) {

        Window3 window3 = new Window3();

        Thread thread1 = new Thread(window3);
        Thread thread2 = new Thread(window3);
        Thread thread3 = new Thread(window3);

        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

