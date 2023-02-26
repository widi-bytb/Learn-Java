package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/*
 * 处理流之一：缓冲流的使用
 *
 * 1.缓冲流：
 * BufferedInputStream
 * BufferedOutputStream
 * BufferedReader
 * BufferedWriter
 *
 * 2.作用：提供流的读取，写入的速度
 *   提高读写速度的原因：内部提供了一个缓冲区
 *
 * 3.处理流，就是“套接”在已有的流的基础上
 * */
public class BufferTest {

    /*
     * 实现非文本文件的复制
     *
     *
     *
     * */
    @Test
    public void BufferedStreamTest() throws IOException {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File srcFile = new File("爱情与友情.jpg");
            File destFile = new File("爱情与友情3.jpg");

            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
//        要求：先关闭外层的流，再关闭内层的流

            try {
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (bis != null)
                    bis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
//        说明：关闭外层流的同时，内层流也会自动的进行关闭，关于内层流的关闭，我们可以省略
//        fos.close();
//        fis.close();
    }

    /*
     * 使用BufferedReader和BufferedWriter实现文本文件的复制
     *
     *
     * */
    @Test
    public void testBufferedReaderBufferedWriter() {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            File srcFile = new File("dbcp.txt");
            File destFile = new File("dbcp_1.txt");

            FileReader fr = new FileReader(srcFile);
            FileWriter fw = new FileWriter(destFile);

            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);

//            方式一：使用char[]数组
            /*char[] buffer = new char[1024];
            int len;

            while ((len = br.read(buffer)) != -1) {
                bw.write(buffer, 0, len);
            }*/

//            方式二：使用String
            String data;
            while ((data = br.readLine()) != null) {
                bw.write(data);//data中不包含换行符
                bw.newLine();//换行符
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bw != null)
                    bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
