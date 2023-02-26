package com.atguigu.java;

/*
 * 一异常处理：抓抛模型
 *
 * 过程一：“抛”：程序在正常执行的过程中，一旦出现异常，就会在异常代码出生成一个对应异常类的对象，
 *              并将此对象抛出。
 *              一旦抛出对象以后，其后的代码就不再执行
 *
 *        关于异常对象的产生：1 系统自动生成的异常对象
 *                          2 手动生成的一个异常对象，并抛出（throws）
 *
 *
 * 过程二：“抓”：可以理解为异常的处理方法：一 try-catch-finally 二 throws
 *
 *
 * 二，try-catch-finally的使用
 * try{
 *  //可能出现异常的代码
 * }catch(异常类型1 变量名1){
 *    处理异常的方法1
 * }catch(异常类型1 变量名1){
 *    处理异常的方法1
 * }
 * .......
 * finally{
 *    一定会执行的代码
 * }
 *
 * 说明：
 * 1.finally是可选的
 * 2.使用try将可能出现异常代码包装起来，在执行过程中，一旦出现异常，就会生成一个对应异常类的对象，根据此对象的类型
 *   去catch中进行匹配
 * 3.一旦try中的异常对象匹配到某一个catch时，就进入catch中进行异常处理。一旦处理完成，就跳出当前的try-catch结构（在没有写finally的情况）。
 *   继续执行其后的代码
 * 4.catch中的异常类型如果没有子父类关系，则谁声明在上，谁声明在下，没有要求
 *   catch中的异常类型如果满课子父类关系，则要子类一定声明在父类的上面。否则，报错。
 * 5.常用的异常对象处理的方式：1 String getMessage()  2 printStackTrace()
 * 6.在try结构中声明的变量，再出了try结构以后，就不能被调用
 * */
public class ExceptionTest1 {
    public static void main(String[] args) {
        ExceptionTest1 e = new ExceptionTest1();
        e.test();
    }

    public void test() {

        String str = "123";
        str = "abc";
        try {
            int num = Integer.parseInt(str);
            System.out.println("hello---1");
        } catch (NumberFormatException e) {
            System.out.println("出现数值转换异常了");
            e.printStackTrace();
//            e.getMessage();
        }

        System.out.println("hello---2");
    }
}
