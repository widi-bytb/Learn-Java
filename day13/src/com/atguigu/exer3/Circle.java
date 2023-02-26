package com.atguigu.exer3;

public class Circle extends GeometricObject {

    private double radius;

    public Circle() {
        radius = 1.0;

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, double weight) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return Math.PI * radius * radius;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Circle) {
            Circle c1 = (Circle) obj;
            return this.radius == c1.radius;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
