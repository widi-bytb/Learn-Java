package com.atuigu.java4;

public class Man extends Person {

    boolean isSmoking;

    public void earnMoney() {
        System.out.println("男人负责挣钱养家");
    }

    public void eat() {
        System.out.println("男人都吃肉");
    }

    @Override
    public void walk() {
        System.out.println("男人霸气的走路");
    }
}
