package com.atguigu.exer3;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(2);
        Circle c2 = new Circle(2.3, "white", 2);

        System.out.println("颜色是否相等：" + c1.getColor().equals(c2.getColor()));

        System.out.println("半径是否相等" + c1.equals(c2));

        System.out.println(c1.toString());
    }
}
