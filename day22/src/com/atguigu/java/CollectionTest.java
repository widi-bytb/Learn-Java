package com.atguigu.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/*
 * Collection接口中声明的方法的测试
 * 结论：
 * 向Collection接口的实现类的对象中添加数据obj,要求obj所在类要重写equals()
 *
 * */
public class CollectionTest {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
//        Person p = new Person("jerry", 20);
//        coll.add(p);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);
//        1.contains(Object obj)判断当前集合中是否包含obj
        boolean contains = coll.contains(123);
        System.out.println(contains);
        System.out.println(coll.contains(new String("Tom")));
        System.out.println(coll.contains(new Person("Jerry", 20)));

        System.out.println("***********");
//        2. coll.containsAll(Collections coll1)判断形参coll1中的所有元素是否都存在当前集合中。

        Collection coll1 = Arrays.asList(123, 456);
        System.out.println(coll.containsAll(coll1));

        System.out.println("***********************************");
//        3.remove(Object obj)
        System.out.println(coll.remove(123));
        System.out.println(coll);

        System.out.println("*******************");

//        4.removeAll(Collection coll1)从当前集合中移除coll1中的所有元素


//        5.retainAll(Collection coll) 交集：获取当前集合和coll1集合的交集，并返回给当前集合
        coll.retainAll(coll1);
        System.out.println(coll);


//        6.equals(Object obj)要想返回true，需要当前集合和形参集合的元素都相同

//        7.hashCode()返回当前对象的哈希值
        System.out.println(coll.hashCode());

//        8.集合--->数组toArray()
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

//        扩展：数组--->集合 调用Arrays类的静态方法asList()
        List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
        System.out.println(list);


//        9.iterator():返回Iterator接口的实例，用于遍历集合元素。放在IteratorTest.java中
    }
}
