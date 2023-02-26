package com.atguigu.java2;

/*
 * this关键字的使用：
 *
 * this调用构造器
 *   1.我们在类的构造器中，可以显式的使用“this（形参列表）”方式，调用本类中指定的其他构造器
 *   2.构造器中不能通过“this（形参列表）”方式调用自己
 *   3.如果一个类中有n个构造器，则最多有n-1构造器中使用了"this（形参列表）"
 *   4.规定：“this（形参列表）”必须声明在当前构造器的首行
 *   5. 构造器内部，最多只能声明一个“this（形参列表）”，用来调用其他的构造器
 *
 * */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.setAge(1);
        System.out.println(p1.getAge());

    }
}

class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}