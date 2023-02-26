package com.atguigu.java;

import java.util.ArrayList;
import java.util.Collection;

/*
 * jdk 5.0 新增了foreach循环，用于遍历集合、数组
 *
 *
 *
 * */
public class ForTest {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);

//        for(集合元素的类型 局部变量 ： 集合对象)
//        内部仍然调用了迭代器。
        for (Object obj : coll) {
            System.out.println(obj);
        }
    }
}
