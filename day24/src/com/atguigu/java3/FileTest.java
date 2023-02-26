package com.atguigu.java3;

import java.io.File;

/*
 * File类的使用
 *
 * 1.File类的一个对象，代表一个文件或一个文件目录（俗称：文件夹）
 * 2.File类声明在java.io包下
 * 3.File类中涉及到关于文件或文件目录的创建，删除，重命名，修改时间，文件大小等方法，
 *   并未涉及到写入或读取文件内容的操作，如果需要读取或写入文件内容，必须使用IO流来完成。
 *
 * */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("D:\\win\\Java\\Learn Java");

        String[] list = file.list();

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println();

        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }
}
