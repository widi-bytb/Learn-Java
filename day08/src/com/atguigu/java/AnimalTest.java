package com.atguigu.java;

/*
 * 面向对象的特征一：封装与隐藏
 *
 * 封装性的体现：
 * 我们将类的属性私有化（private）,提供公共的(public)方法来获取（get）和设置（set）此属性的值
 *
 *   拓展：封装性的体现：1，如上 2 不对外暴露的私有方法 3 ,单例模式....
 *
 * 封装性的体现，需要权限修饰符来配合
 * 1.Java规定的4中权限：(从小到达排列)：private、缺省、protected、public
 * 2.4中权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部类
 * 3.具体的，4中权限都可以用来修饰类的内部结构：属性、方法、构造器、内部类
 *        修饰类的话，只能使用：缺省,public
 * */
public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "大黄";
//        a.legs = 4;
        a.eat();
        a.setLegs(6);
        a.show();
    }
}

class Animal {

    String name;
    private int age;
    private int legs;

    public void setLegs(int l) {
        if (l >= 0 && l % 2 == 0) {
            legs = l;
        } else {
            legs = 0;
        }
    }

    public int getLegs() {
        return legs;
    }

    public void setAge(int a) {
        if (a >= 0 && a <= 100) {
            age = a;
        } else {
            age = 0;
        }
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println("动物进食");
    }

    public void show() {
        System.out.println(name + age + legs);
    }
}
