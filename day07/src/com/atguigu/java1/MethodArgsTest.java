package com.atguigu.java1;

/*
 *可变个数形参的方法
 *
 * */
public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest test = new MethodArgsTest();
        test.show("s");
    }

    public void show(int i) {
        System.out.println(1);
    }

    public void show(String s) {
        System.out.println(2);
    }

    public void show(String... strs) {
        System.out.println(3);
    }

    /*public void show(String[] strs){

    }*/
}
