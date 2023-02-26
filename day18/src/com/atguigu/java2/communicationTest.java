package com.atguigu.java2;

/*
 *
 * 线程通信的例子：使用两个线程打印 1- 100 ，线程1 线程2 交替打印
 *
 *
 * 面试题：sleep()和wait()的异同？
 * 1。相同点：一旦执行方法，都可以使得当前的线程进入阻塞状态
 * 2.不同点：1.两个方法声明的位置不一样：Thread类中声明sleep()，Object类中声明wait()
 *          2.调用的要求不同：sleep()可以在任何需要的场景下调用。wait()必须使用在同步代码块或同步方法中调用
 *          3.关于是否释放同步监视器：如果两个方法都使用在同步代码块或同步方法中，sleep()不会释放锁，wait()会释放锁
 * */


class Number implements Runnable {
    private int number = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {

                notify();

                if (number <= 100) {

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    break;

                }
            }
        }
    }
}


public class communicationTest {
    public static void main(String[] args) {
        Number number = new Number();

        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("线程一");
        t2.setName("线程二");


        t1.start();
        t2.start();

    }
}
