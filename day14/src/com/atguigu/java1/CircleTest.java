package com.atguigu.java1;

/*
 * static关键字的应用
 *
 * */
public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        Circle c1 = new Circle();
        Circle c2 = new Circle(3);

        System.out.println(c.getId());
        System.out.println(c1.getId());
        System.out.println(c2.getId());


        System.out.println("创建圆的个数为：" + Circle.getTotal());
    }
}

class Circle {
    private double radius;
    private int id;

    public Circle() {
        id = init++;
        total++;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
//        id = init++;
//        total++;
    }

    private static int total;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }


    public static int getTotal() {
        return total;
    }


    public static int getInit() {
        return init;
    }

    private static int init = 1001;

    public double findArea() {
        return Math.PI * radius * radius;
    }
}