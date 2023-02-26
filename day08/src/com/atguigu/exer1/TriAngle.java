package com.atguigu.exer1;

/*
 * 编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底边长base和高height，同时声明公共方法访问私有变量。
 * 此外，提供类必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。
 */
public class TriAngle {
    private int base;
    private int height;

    public TriAngle() {

    }

    public TriAngle(int b, int h) {
        base = b;
        height = h;
    }

    public void setBase(int n) {
        base = n;
    }

    public int getBase() {
        return base;
    }

    public void setHeight(int n) {
        height = n;
    }

    public int getHeight() {
        return height;
    }


}
