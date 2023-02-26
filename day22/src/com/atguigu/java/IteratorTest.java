package com.atguigu.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 集合元素的遍历操作，使用Iterator接口
 * 1.内部的方法：hasNext()和next()
 * 2.集合对象每次调用iterator()方法都得到一个全新的迭代器对象，
 * 默认游标都在集合的第一个元素之前
 * 3.内部定义了remove()，可以在遍历的时候，删除集合中的元素。此方法不同于集合直接调用remove()
 * */
public class IteratorTest {

    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
//        Person p = new Person("jerry", 20);
//        coll.add(p);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);

        Iterator iterator = coll.iterator();
      /*  System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
*/

//        推荐
//        hasNext()判断是否还有下一个元素
        while (iterator.hasNext()) {
//            next() 指针下移 将下移以后集合位置上的元素返回
            System.out.println(iterator.next());
        }
        System.out.println("********************");
        iterator = coll.iterator();
//        remove移除集合中某一个元素
//        如果还未调用next()或在上一次调用next方法之后已经调用了remove方法，
//        再调用remove都会报IllegalStateException
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if ("Tom".equals(obj)) {
                iterator.remove();
            }
        }
        iterator = coll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
