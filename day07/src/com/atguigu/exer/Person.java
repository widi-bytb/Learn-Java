package com.atguigu.exer;

public class Person {
    String name;
    int age;
    /**
     * sex 1 男
     * sex 0 女
     */
    int sex;

    public void study() {
        System.out.println("studying");
    }

    public void showAge() {
        System.out.println("我的年龄是" + age);
    }

    public int addAge(int i) {
        age += i;
        return age;
    }
}
