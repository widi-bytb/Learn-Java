package com.atguigu.java;

/*
 *
 * try-catch-finally的使用
 *
 * 1.finally是可选的
 * 2.finally中声明的是一定会被执行的代码，即使catch中有出现异常了，try中有return语句，catch中标有
 *   return与语句等情况。
 *
 * 3.像数据库连接，输入输出流，网络编程Socket等资源，JVM是不能自动回收的，我们需要自己手动的进行资源释放
 *   ，此时的资源释放，就需要声明在finally中。
 *
 *
 * */
public class FinallyTest {
    public static void main(String[] args) {

        FinallyTest f = new FinallyTest();
        f.test();
    }

    public void test() {
        try {
            int a = 10;
            int b = 0;

            System.out.println(a / b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("一定会执行的代码");
        }
    }
}
