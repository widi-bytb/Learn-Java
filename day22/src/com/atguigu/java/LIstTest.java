package com.atguigu.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * /----Collection接口：单列集合，用来存储一个个的对象
 *         /----List接口:存储有序的、可重复的数据
 *              /----ArrayList ：作为List接口的主要实现类；线程不安全的，效率高；底层使用Object[]存储 elementData存储
 *              /----LinkEdList；对于频繁的插入、删除操作、使用此类的效率比ArrayList高；底层使用双向链表存储
 *              /----Vector ： 作为List接口的古老实现类 ；线程安全的，效率低；底层使用Object[]存储 elementData存储
 *
 *
 *      1.ArrayList的源码分析：
 *        jdk8 ：ArrayList List = new ArrayList(); 底层Object[] elementData初始化为{}，并没有创建长度为10的
 *
 *        List.add(123); 第一次调用add()时，底层才创建了长度为10的数组，并将数据123添加到elementData
 *
 *        如果此次的添加导致底层elementData数组容量不够，则扩容。
 *        默认情况下，扩容为原来的容量的1.5倍，同时需要将原有数组中的数据复制到新的数组中。
 *
 *        结论：建议开发中使用带参的构造器：ArrayList List = new ArrayList(int capacity)
 *
 *      2.LinkedList的源码分析：
 *          LinkedList list = new LinkedList(); 内部声明了Node类型的first和last属性，默认值为null
 *          list.add(123) 将123封装到Node中，创建了Node对象
 *
 *         其中，Node定义为：体现了LinkedList的双向链表的说法
 *         private static class Node<E> {
 *          E item;
 *          Node<E> next;
 *          Node<E> prev;
 *
 *          Node(Node<E> prev,E element, Node<E> next){
 *          this.item = element;
 *          this.next = next;
 *          this.prev = prev;
 * }
 * }
 *
 *
 * 面试题：ArrayList、LinkedList、Vector三者的异同？
 *       同：三个类都是实现了List接口，存储数据的特点相同：存储有序的、可重复的数据
 *
 *
 *
 *    5.List接口中的常用方法
 *  void add(int index, Object ele):在index位置插入ele元素
    boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
    Object get(int index):获取指定index位置的元素
    int indexOf(Object obj):返回obj在集合中首次出现的位置
    int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
    Object remove(int index):移除指定index位置的元素，并返回此元素
    Object set(int index, Object ele):设置指定index位置的元素为ele
    List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的左闭右开子集合
 * */
public class LIstTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom", 20));
        list.add(456);

        System.out.println(list);

//        void add(int index, Object ele):在index位置插入ele元素
        list.add(1, "BB");
        System.out.println(list);

//        boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
        List list1 = Arrays.asList(1, 2, 3);
        list.addAll(list1);
        System.out.println(list);

//        Object get(int index):获取指定index位置的元素
        System.out.println(list.get(1));

//        int indexOf(Object obj):返回obj在集合中首次出现的位置,如果不存在返回-1
        System.out.println(list.indexOf(456));

//        int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
        System.out.println(list.lastIndexOf(456));

//        Object remove(int index):移除指定index位置的元素，并返回此元素
        System.out.println(list.remove(0));

//        Object set(int index, Object ele):设置指定index位置的元素为ele
        list.set(0, 123);
        System.out.println(list);

//        List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的左闭右开子集合
        System.out.println(list.subList(0, 3));
    }

}
