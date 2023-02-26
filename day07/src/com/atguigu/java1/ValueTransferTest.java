package com.atguigu.java1;

/*
 *关于变量的赋值
 * */
public class ValueTransferTest {
    public static void main(String[] args) {
        int m = 10;
        int n = m;

        System.out.println("m =" + m + ",n =" + n);

        n = 20;
        System.out.println("m = " + m + ", n=" + n);
    }
}
