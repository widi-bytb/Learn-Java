package com.atguigu.java;

import java.util.*;

public class TreeMapTest {
    /*public static void main(String[] args) {
//        向TreeMap中添加key-value，要求key必须是由同一个类创建的对象
//        因为要按照key进行排序：自然排序、定制排序

//        自然排序
        TreeMap map = new TreeMap();
        User u1 = new User("Tom", 23);
        User u2 = new User("Jerry", 18);
        User u3 = new User("Jack", 20);
        User u4 = new User("Marry", 16);
        map.put(u1, 98);
        map.put(u2, 89);
        map.put(u3, 70);
        map.put(u4, 100);

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
    }*/
    public static void main(String[] args) {
//        向TreeMap中添加key-value，要求key必须是由同一个类创建的对象
//        因为要按照key进行排序：自然排序、定制排序

//        定制排序
        TreeMap map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User) {
                    User u1 = (User) o1;
                    User u2 = (User) o2;

                    return Integer.compare(u1.getAge(), u2.getAge());
                }
                throw new RuntimeException("输入的类型不匹配！");
            }
        });
        User u1 = new User("Tom", 23);
        User u2 = new User("Jerry", 18);
        User u3 = new User("Jack", 20);
        User u4 = new User("Marry", 16);
        map.put(u1, 98);
        map.put(u2, 89);
        map.put(u3, 70);
        map.put(u4, 100);

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
    }
}
