package com.atguigu.java2;

/*
 * 递归方法的使用
 * */
public class RecursionTest {
    public static void main(String[] args) {
//    例一:计算1-100之间所有自然数的和
//        方式一
/*        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
            System.out.println(sum);
        }*/

//        方式二
       RecursionTest test = new RecursionTest();
       int sum1 = test.getSum(100);
        System.out.println(sum1);
    }

    public int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }

    }

}
