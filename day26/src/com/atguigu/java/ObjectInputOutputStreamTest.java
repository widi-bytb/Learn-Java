package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/*
 * 对象流的使用
 * 1.ObjectInputStream 和 ObjectOutputStream
 * 2.作用：用于存储和读取基本数据类型数据或对象的处理流。它的强大之处就是可以把Java中的对象写入到数据源中，也能把对象从数据源中还原回来
 *
 * 3.要想一个Java对象是可序列化的，需要满足相应的要求。见Person.java
 *
 * 4.序列化机制：
 * 对象序列化机制允许把内存中的Java对象转换成平台无关的二进制流，从而允许把这种
 * 二进制流持久地保存在磁盘上，或通过网络将这种二进制流传输到另一个网络节点。
 * 当其他程序获取了这个二进制流，就可以恢复成原来的Java对象
 * */
public class ObjectInputOutputStreamTest {

    /*
       序列化过程：将内存中的Java对象保存到磁盘中或通过网络传输出去
       使用ObjectOutputStream实现

     */
    @Test
    public void testObjectOutputStream() {

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("object.dat"));

            oos.writeObject(new String("我爱北京天安门"));

            oos.flush();

            oos.writeObject(new Person("李白", 22));

            oos.flush();//刷新操作
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            try {
                if (oos != null)
                    oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }


    /*
     * 反序列化：将磁盘文件中的对象还原为内存中的一个Java对象
     * 使用ObjectInputStream来实现
     * */
    @Test
    public void testObjectInputStream() {

        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("object.dat"));

            Object obj = ois.readObject();

            String str = (String) obj;

            Person p = (Person) ois.readObject();
            System.out.println(p);
            System.out.println(str);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        }


    }


}
