package com.atguigu.java;

/*
 * 面向对象特征之三：多态性
 *
 *1.理解多态性：可以理解为一种事物的多种形态
 * 2.何为多态性：
 *    对象的多态性：父类的引用指向子类的对象
 *
 * 3.多态的使用：虚拟方法的使用
 *   有了对象的多态性以后，我们在编译期，只能调用父类中声明的方法，但在运行期，我们实际执行的是子类重写父类的方法。
 *   总结：编译：看左边；运行：看右边
 *
 * 4.多态性的使用前提：1 类的继承关系 2 方法的重写
 *
 * 5.对象的多态性，只适用于方法，不适用属性
 *
 * **********************************************
 *
 *
 * */
public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.eat();
        man.age = 25;
        man.earnMoney();

//        对象的多态性：父类的引用指向子类的对象
        Person p2 = new Man();

//        Person p3 = new Woman();
//        多态的使用：当调用子父类同名同参数的方法时，实际执行的是子类重写的父类的方法--虚拟方法的调用
        p2.eat();

//        p2.earnMoney();
//        有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法的，但是由于变量声明为父类类型，导致
//        编译时，只能调用父类中声明的属性和方法。子类特有的属性和方法不能调用

//        如何才能调用子类特有的属性和方法？
//        向下转型：使用强制类型转换符
        Man m1 = (Man) p2;

        m1.earnMoney();
        m1.isSmoking = true;
        m1.walk();
        String s1 = "atguigu";
        String s2 = "atguigu";
        s1.equals(s2);

//        使用强转时，可能出现ClassCastException的异常
//        Woman w1 = (Woman) m1;

        /*instanceof的关键字的使用
         *
         * a instanceof A:判断对象a是否是类a的实例。如果是，返回true，如果不是，返回false
         *
         *
         * */

        if (p2 instanceof Woman) {
            Woman w1 = (Woman) p2;
            w1.goShopping();
        }

    }

}
