package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/*
 * 一、流的分类
 *  1.操作数据单位：字节流、字符流
 *  2.数据的流向：输入流、输出流
 *  3.流的角色：节点流、处理流
 *
 * 二、流的体系结构
 * 抽象基类           节点流（文件流）                          缓冲流（处理流的一种）
 * InputStream   FileInputStream(read(byte[] buffer))           BufferedInputStream
 * OutputStream  FileOutputStream(write(byte[] buffer,0,len))   BufferedOutputStream
 * Reader        FileReader(read(char[] cbuf))                   BufferedReader
 * Writer        FileWriter(write(char[] cbuf,0,len))            BufferedWriter
 *
 *
 * */
public class FileReaderWriterTest {
    public static void main(String[] args) {
        File file = new File("hello.txt");
        System.out.println(file.getAbsolutePath());
    }


    /*
     *将day25下的hello.txt文件内容读入程序中，并输出到控制台
     *
     * 说明点：
     * 1.read()的理解：返回读入的一个字符。如果达到文件末尾，返回-1
     * 2.异常的处理：为了保证流资源一定可以执行关闭操作。需要使用try-catch-finally处理
     * 3.读入的文件一定要存在，否则就会报FileNotFoundException
     * */
    @Test
    public void testFileReader() {
        FileReader fr = null;
        try {
//        1.实例化File类的对象，指明要操作的文件
            File file = new File("hello.txt");//相较于当前的Module
//        2.提供具体的流
            fr = new FileReader(file);
//        3.数据的读入
//        read():返回一个字符，如果达到文件末尾，返回-1
       /* int data = fr.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fr.read();
        }*/

            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
//        4.流的关闭操作
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    //    对read()操作升级：使用重载方法
    @Test
    public void testFileReader1() {
        FileReader fr = null;
        try {
//        1.File类的实例化
            File file = new File("hello.txt");
//        2.FileReader流的实例化
            fr = new FileReader(file);
//        3.读入的操作
//        read(char[] cbuf):返回每次读入cbuf数组中的字符个数。如果达到文件末尾返回-1
            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1) {
//                错误的写法
              /*  for (int i = 0; i < cbuf.length; i++) {
                    System.out.print(cbuf[i]);
                }*/
                for (int i = 0; i < len; i++) {
                    System.out.print(cbuf[i]);

                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
//        4.资源的关闭
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /*
     * 从内存中写出数据到硬盘的文件里
     *
     * 说明：
     * 1.输出操作，对应的File可以不存在的。并不会报异常
     *            File对应的硬盘中的文件如果不存在，在输出的过程中，会自动创建此文件。
     *            File对应的硬盘中的文件如果存在：
     *                如果流使用的构造器是：FileWriter(file,false)/FileWriter(file)：对原有文件的覆盖
     *                如果流使用的构造器是：FileWriter(file,true):不会对原有覆盖，而是在原有文件基础上追加内容
     *
     * */
    @Test
    public void testFileWriter() {
        FileWriter fw = null;
        try {
//        1.提供File类的对象，指明写出到的文件
            File file = new File("hello1.txt");
//        2.提供FileWriter的对象，用于数据的写出
            fw = new FileWriter(file, false);
//        3.写出的操作
            fw.write("I have a dream!\n");
            fw.write("you need to have a dream!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
//        4.流资源的关闭
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }

    @Test
    public void testFileReaderFileWriter() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
//        1.创建FIle类的对象，指明读入和写出的文件
            File srcFile = new File("hello.txt");
            File destFile = new File("hello2.txt");
//        2.创建流入流和输出流的对象
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);
//        3.数据的读入和写出操作
            char[] cbuf = new char[5];
            int len;//记录每次读入到cbuf数组中的字符的个数
            while ((len = fr.read(cbuf)) != -1) {
                //            每次写出len个字符
                fw.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
//        4.关闭流资源

            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
