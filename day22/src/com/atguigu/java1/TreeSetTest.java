package com.atguigu.java1;

import java.util.TreeSet;

/*
 * 1，向TreeSet中添加的数据，要求时相同类的对象
 * 2.两种排序方式：自然排序(实现Comparable接口) 和 定制排序 （comparator）
 *
 * 3.自然排序中，比较两个对象是否相同的标准为：compareTo()返回0，不再是equals()
 * 4.定制排序中，比较两个对象是否相同的标准为：comparator()返回0，不再是equals()
 * */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();

//        不能添加不同类的对象
       /* treeSet.add(123);
        treeSet.add(123);
//        treeSet.add("AA");*/

    }
}
