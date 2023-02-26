package com.atguigu.java2;

/*
 *单例模式的懒汉式的实现
 *
 * */
public class SingletonTest1 {

    public static void main(String[] args) {
        Order o1 = Order.getInstance();
        Order o2 = Order.getInstance();

        System.out.println(o1 == o2);
    }
}

class Order {
    //    私有化类的构造器
    private Order() {

    }

    //    声明当前类对象，没有初始化
//    此对象也必须声明为static的
    private static Order instance = null;

    //声明public,static的返回当前的类对象的方法
    public static Order getInstance() {
        if (instance == null) {
            instance = new Order();
        }

        return instance;
    }
}