package com.atguigu.exer;


public class PersonTest {
    public static void main(String[] args) {
        Person b = new Person();
        b.setAge(10);
        System.out.println(b.getAge());


        Person p2 = new Person(18,"Tom");

        System.out.println(p2.getName());
        System.out.println(p2.getAge());
    }

}
