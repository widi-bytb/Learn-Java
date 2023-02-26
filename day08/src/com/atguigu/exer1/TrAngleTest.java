package com.atguigu.exer1;

public class TrAngleTest {
    public static void main(String[] args) {
        TriAngle t1 = new TriAngle();
        t1.setBase(2);
        t1.setHeight(4);
        System.out.println(t1.getBase() + "," + t1.getHeight());

        TriAngle t2 = new TriAngle(10,20);
        System.out.println(t2.getBase() + "," + t2.getHeight());

    }
}
