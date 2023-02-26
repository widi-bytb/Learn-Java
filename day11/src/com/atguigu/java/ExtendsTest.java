package com.atguigu.java;

/**
 * 面向对象的特征之二：继承性
 * Java中关于继承性的规定
 * 1一个类可以被多个子类继承
 * 2.一个类只能有一个父类
 * 3.子父类是相对的概念
 * 4.子类直接继承的父类，称为：直接父类。间接继承的父类：间接父类
 * 5.子类继承父类以后，就获取了直接父类以及所有间接父类中声明的属性和方法。
 * 1.如果我们没有显式的声明一个类的父类的话，则此类继承java.lang.Object类、
 * 2.所有的Java类（除Java.lang.Object类之外）都直接或间接的继承java.lang.Object类
 * 3.所有的Java类具有java.lang.Object类声明的功能
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        Student s1 = new Student();
        s1.eat();
        s1.sleep();
        s1.name = "Tom";
    }
}
