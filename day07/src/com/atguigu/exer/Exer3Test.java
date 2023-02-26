package com.atguigu.exer;

/*
 * 3.1 编写程序。声明一个method方法，在方法中打印一个10*8的*型矩形，在main方法中调用该方法。
 *
 * 3.2修改上一个程序，在method方法中，除打印一个10*8的*型矩形外，在计算该矩形的面积，并将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
 *
 *
 * */
public class Exer3Test {
    public static void main(String[] args) {
        Exer3Test test = new Exer3Test();
//        System.out.println(test.method());
        System.out.println(test.method(10,10));
    }


//    3.1
    /*public void method() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }*/


    //    3.2
   /* public int method() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return 10 * 8;
    }*/

    public int method(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return m * n;
    }
}
