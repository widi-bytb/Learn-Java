package com.atguigu.java1;

/*
 * static关键字的使用
 *
 * 1.static：静态
 * 2.static可以用来修饰：属性，方法，代码块，内部类
 *
 * 3.使用static修饰属性：静态变量（类变量）
 *       属性，按是否使用static修饰，又分为：静态属性 vs 非静态属性（实例变量）
 *       实例变量：我们创建了类的多个对象，每个对象都独立的拥有一套类中的非静态属性。当修改其中一个对象的
 *                非静态属性时，不会导致其他对象中同样的属性值的修改
 *       静态变量：我们创建了类的多个对象，多个对象共享同一个静态变量。当通过某一个对象修改静态变量时，会导致
 *                其他对象调用此静态变量时，是修改过的。
 *       static修饰属性的其他说明：
 *                1 静态变量随着类的加载而加载
 *                2 静态变量的加载要早于对象的创建
 *                3 由于类只会加载一次，则静态变量在内存中也只会存在一份：存在方法区的静态域中
 *
 *
 * 4.使用static修饰方法：静态方法
 *   1 随着类的加载而加载，可以通过“类.静态方法”的方式进行调用。
 *   2 静态方法中，只能调用静态的方法或属性。
 *     非静态方法中，既可以调用非静态方法或属性，也可以调用静态的方法或属性
 *
 *
 * 5.static注意点：
 *         在静态的方法内，不能使用this关键字，super关键字
 *
 * 6.开发中，如何确定一个属性是否声明为static的?
 *     >属性是可以被读个对象所共享的，不会随对象的不同而不同的。
 *     >类中的常量也常常声明为static
 *   开发中，如何确定一个方法是否要声明为static的?
 *     >操作静态属性的方法，通常设置为static
 *     >工具类中的方法，习惯上声明为static，比如：Match,Arrays,Collection
 * */
public class StaticTest {
    public static void main(String[] args) {

        Chinese c = new Chinese();
        c.name = "张三";
        c.age = 18;

        Chinese c1 = new Chinese();
        c1.name = "李四";
        c1.age = 28;

        c.nation = "CHN";

        System.out.println(c1.nation);
        Chinese.show();

    }
}

class Chinese {
    String name;
    int age;
    static String nation;

    public static void show() {
        System.out.println("我是一名中国人");
    }
}