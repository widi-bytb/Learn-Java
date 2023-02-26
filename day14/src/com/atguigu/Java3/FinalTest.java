package com.atguigu.Java3;

/*
 * final关键字的使用
 *
 * 1.final可以用来修饰的结构：类、方法、变量
 *
 * 2.final用来修饰一个类：此类不能被其他的类所继承。
 *                     比如：String类，System类，StringBuffer类
 *
 * 3.final 用来修饰方法：表明此方法不可以被重写
 *                      比如：Object类中getClass()
 *
 * 4.final 用来修饰变量：此时的“变量”就称为是一个常量
 *                    final修饰属性：可以考虑赋值的位置有：显式初始化，代码块中初始化，构造器中初始化
 *                    final修饰局部变量：
 *                         尤其使用final修饰形参时，表明此形参是一个常量。当我们调用此方法时，给常量形参赋一个实参。以后。
 *                         就只能在方法体内使用此形参，但不能进行重新赋值。
 *
 * static final 用来修饰属性：全局常量
 *
 *
 * */
public class FinalTest {
}
