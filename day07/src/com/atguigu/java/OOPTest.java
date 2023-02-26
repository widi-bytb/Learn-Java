package com.atguigu.java;

/*
 * 一，Java面向对象学习的三条主线
 * 1.Java类及类的成员：属性，方法，构造器；代码块，内部类
 * 2.面向对象的三大特征：封装性，继承性，多态性
 * 2.其他关键字：this,super,static,final,abstract,interface,package,import
 *
 *
 * 二、设计类，其实就是设计类的成员
 * 1.创建类，设计类的成员
 * 2.创建类的对象
 * 3.通过“对象.属性”或"对象.方法"调用对象的结构
 *
 * 三、如果创建了一个类的多个对象，则每个对象都独立的拥有一套类的属性。（非static的）
 *
 * 属性 = 成员变量 = field = 字段
 * 方法 = 成员方法 = 函数 = method
 *
 * 创建类的对象 = 类的实例化 = 实例化类
 * */
public class OOPTest {
    public static void main(String[] args) {
//       创建Person类的对象
        Person p1 = new Person();

//        调用对象的结构：属性、方法
        p1.name = "Jack";
        p1.isMale = true;
        p1.age = 18;
        System.out.println(p1.name);
        p1.eat();
        p1.sleep();
        p1.talk("Chinese");

        Person p2 = new Person();
        System.out.println(p2.name);
//      将p1变量保存的对象地址值赋给p3,导致p1和p3指向了堆空间的同一个对象实体
        Person p3 = p1;
        p3.name = "Tom";
        System.out.println(p3.name);
    }
}

//1.创建类，设计类的成员
class Person {
    //    属性
    String name;
    int age;
    boolean isMale;

    //    方法
    public void eat() {
        System.out.println("人可以吃饭");
    }

    public void sleep() {
        System.out.println("人可以睡觉");
    }

    public void talk(String languag) {
        System.out.println("人可以说话，语言是" + languag);
    }
}
