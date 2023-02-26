package com.atguigu.java;

/*
 * 抽象类的匿名子类
 *
 * */
public class PersonTest {
    public static void main(String[] args) {
        method(new Student());//匿名对象

        Worker worker = new Worker();
        method1(worker);

//        创建了以匿名子类的对象
        Person p = new Person() {
            @Override
            public void eat() {
                System.out.println("吃饭");
            }

            @Override
            public void breath() {
                System.out.println("赶紧呼吸");
            }
        };

        method1(p);
    }

    public static void method1(Person p) {
        p.eat();
        p.walk();
    }

    public static void method(Student s) {

    }
}

class Worker extends Person {

    @Override
    public void breath() {

    }

    @Override
    public void eat() {

    }
}
