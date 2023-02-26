package com.atguigu.exer1;

import java.util.List;

/*
 * 创建DAO类的对象，分别调用其save，get，update，list，delete方法来操作User对象，
 *
 *
 *
 *
 * */
public class DAOTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();

        dao.save("1001", new User(1001, 18, "Tom"));
        dao.save("1002", new User(1002, 28, "Jack"));
        dao.save("1003", new User(1003, 15, "Marry"));

        dao.update("1003", new User(1003, 19, "杰克手"));

        List<User> list = dao.list();

        list.forEach(System.out::println);

    }
}
