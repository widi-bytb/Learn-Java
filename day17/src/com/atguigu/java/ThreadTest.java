package com.atguigu.java;

/*
 * 多线程的创建,方式一：继承Thread类
 * 1. 创建一个继承于Thread类的子类
 * 2. 重写Thread类的run()  -->将此线程执行的操作声明在run()方法中。
 * 3. 创建Thread类的子类的对象
 * 4. 通过此对象调用start():1 启动当前线程 2 调用当前线程的run()
 *
 * 例子：遍历100以内所有的偶数
 *
 * */

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}


public class ThreadTest {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        myThread.start();

//        我们不能通过直接调用run()的方式启动线程


//        在启动一个线程，不可以还让已经start()的线程去执行会报异常
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i + "******************");
            }
        }


    }

}
