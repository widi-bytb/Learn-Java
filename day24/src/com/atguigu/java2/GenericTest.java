package com.atguigu.java2;

import java.util.List;

/*
 * 1.泛型在继承方面的体现
 *
 *  虽然类A是类B的父类，G<A> 和G<B> 二者不具备子父类关系，二者是并列关系。
 *
 *   补充：类A是类B的父类，A<G> 是B<G> 的父类
 *
 * 3.通配符的使用
 *   通配符 ?
 *   类A是类B的父类,G<A>和G<B>是没有关系的，二者共同的父类是：G<?>
 *
 *
 * */
public class GenericTest {
    public static void main(String[] args) {

        Object obj = null;
        String str = null;
        obj = str;

        Object[] arr1 = null;
        String[] arr2 = null;
        arr1 = arr2;

        List<Object> list1 = null;
        List<String> list2 = null;

//        list1 = list2;

    }
}
