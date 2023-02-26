package com.atuigu.exer1;

public class CylinderTest {
    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();

        c1.setRadius(2.5);

        c1.setLength(10);
        System.out.println(c1.findVolume());

    }
}
