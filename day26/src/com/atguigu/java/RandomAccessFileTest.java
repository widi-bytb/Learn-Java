package com.atguigu.java;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * RandomAccessFile的使用
 * 1.RandomAccessFile直接继承于java.lang.Object类，实现DataInput和DataOutPut接口
 * 2.RandomAccessFile既可以作为一个输入流，又可以作为一个输出流
 *
 * 3.如果RandomAccessFile作为输出流时，写出到的文件如果不存在，则在执行过程中自动创建
 *   如果写出到到的文件存在，则会对原有文件内容进行覆盖。（默认情况下，从头覆盖）
 * */
public class RandomAccessFileTest {

    @Test
    public void test1() {
        RandomAccessFile raf = null;
        RandomAccessFile raf1 = null;
        try {
            raf = new RandomAccessFile(new File("爱情与友情.jpg"), "r");
            raf1 = new RandomAccessFile(new File("爱情与友情1.jpg"), "rw");

            byte[] buffer = new byte[1024];
            int len;

            while ((len = raf.read(buffer)) != -1) {
                raf1.write(buffer, 0, len);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (raf1 != null) {

                try {
                    raf1.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if (raf != null) {

                try {
                    raf.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
