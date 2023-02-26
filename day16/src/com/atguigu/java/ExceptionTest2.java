package com.atguigu.java;

import java.io.File;

/*
 *
 * 异常处理的方式二：throws + 异常类型 写在方法的声明处。指明此方法执行时，可能会抛出的异常类型。
 *                  一旦当方法体执行时，出现异常，仍会在异常代码出生成一个异常类的对象，此对象满足throws后异常
 *                  类型时。就会被抛出。异常代码后续的代码，就不再执行了
 *
 *开发中如果选择使用try-catch-finally 还是使用throws
 *   如果父类中被重写的方法没有throws方式处理异常，则子类重写的方法也不能使用throws，意味着如果
 *   子类重写的方法中有异常，必须使用try-catch-finally方式处理
 *
 *   执行的方法a中，先后调用了另外的几个方法，这几个方法是递进关系执行的。我们建议这几个方法使用throws的方式
 *   进行处理，而执行的方法a可以考虑使用try-catch-finally方式进行处理
 * */
public class ExceptionTest2 {
    public static void main(String[] args) {
        ExceptionTest1 exceptionTest1 = new ExceptionTest1();
    }

    public void method1() {

    }
}
