package com.atguigu.exer;

/*
 * 要求：(1) 创建Person类的对象，设置该对象的name,age和sex属性，调用study方法，输出字符串
 * (2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系
 * */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Jack";
        p1.age = 18;
        p1.sex = 1;
        p1.study();
        int newAge = p1.addAge(2);
        System.out.println(newAge);
        p1.showAge();

        Person p2 = new Person();
        p2.showAge();
    }
}
