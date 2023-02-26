package com.atguigu.exer1;

import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTest {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();

        Employee e1 = new Employee("Tom", 25, new MyDate(1998, 10, 1));
        Employee e2 = new Employee("Jack", 24, new MyDate(1999, 11, 5));
        Employee e3 = new Employee("rou", 27, new MyDate(1996, 12, 23));
        Employee e4 = new Employee("Test", 30, new MyDate(1993, 1, 12));
        Employee e5 = new Employee("tek", 20, new MyDate(2002, 5, 5));

        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);
        treeSet.add(e5);

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
