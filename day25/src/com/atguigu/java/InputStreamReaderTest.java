package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/*
  处理流之二：转换流的使用
  1.转换流：属于字符流
    InputStreamReader：将一个字节的输入流转换为字符的输入流
    OutputStreamWriter：将一个字符的输出流转换为字节的输出流
  2.作用：提供字节流与字符流之间的转换

 */
public class InputStreamReaderTest {

    /*
     * InputStreamReader的使用，实现字节的输入流到字符的输入流的转换
     * */
    @Test
    public void test1() {
        InputStreamReader isr = null;
        try {
            FileInputStream fis = new FileInputStream("dbcp.txt");
            isr = new InputStreamReader(fis);//使用系统默认的字符集

            char[] cbuf = new char[1024];
            int len;
            while ((len = isr.read(cbuf)) != -1) {
                String str = new String(cbuf, 0, len);
                System.out.print(str);
            }
        } catch (IOException e) {


        } finally {
            try {
                if (isr != null)
                    isr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    /*
      综合使用InputStreamReader和OutputStreamWriter
    */

    @Test
    public void test2() {

        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            File file1 = new File("dbcp.txt");
            File file2 = new File("dbcp_gbk.txt");

            FileInputStream fis = new FileInputStream(file1);
            FileOutputStream fos = new FileOutputStream(file2);

            isr = new InputStreamReader(fis, "utf-8");
            osw = new OutputStreamWriter(fos, "gbk");

            char[] cbuf = new char[1024];
            int len;
            while ((len = isr.read(cbuf)) != -1) {
                osw.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (isr != null)
                    isr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (osw != null)
                    osw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
