package com.atuigu.java2;

public class Student extends Person {

    String major;

    public Student() {

    }

    public Student(String major) {
        this.major = major;
    }

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生，多吃营养餐");
    }

    public void study() {
        System.out.println("学生，学习知识");
    }

    public void show() {
        System.out.println("name = " + name + ",age = " + age);
    }
}
