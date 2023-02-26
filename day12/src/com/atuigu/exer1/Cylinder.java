package com.atuigu.exer1;

public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        this.length = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume() {
//        return Math.PI * getRadius() * getRadius() * length;
        return super.findArea() * length;
    }

    @Override
    public double findArea() { //返回圆柱的表面积
        return Math.PI * getRadius() * getRadius() * 2 + 2 * Math.PI * getRadius() * getLength();
    }
}
