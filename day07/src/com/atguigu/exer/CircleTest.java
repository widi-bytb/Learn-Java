package com.atguigu.exer;
/*
 * 2.利用面向对象的编程方法，设计类Circle计算圆的面积
 * */

//测试类
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 5;
        double area = c1.CircularArea();
        System.out.println(area);
    }
}

//圆
class Circle {

    //    属性
    double radius;

    //    求圆的面积的方法
    public double CircularArea() {
        return Math.PI * radius * radius;
    }
}
