package com.atguigu.exer3;

public class ComparableCircleTest {
    public static void main(String[] args) {

        ComparableCircle c1 = new ComparableCircle(3.4);
        ComparableCircle c2 = new ComparableCircle(3.1);


        int compareVale = c1.compareTo(c2);
        if (compareVale > 0) {
            System.out.println("c1对象大");
        } else if (compareVale < 0) {
            System.out.println("c2对象大");
        } else {
            System.out.println("一样大");
        }
    }
}
