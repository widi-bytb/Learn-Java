package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/*
 *
 * 测试FileInputStream和FileOutputStream的使用
 *
 *
 * */
public class FileInputOutputStreamTest {

    /*
     * 实现对图片的复制操作
     *
     * */
    @Test
    public void testFileInputOutputStream() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File srcFile = new File("爱情与友情.jpg");
            File destFile = new File("爱情与友情1.jpg");

            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

//        复制的过程
            byte[] buffer = new byte[5];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

    //    指定路径下文件的复制
    public void copyFile(String srcPath, String destPath) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);

            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

//        复制的过程
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void testCopyFile() {
        long start = System.currentTimeMillis();

        copyFile("01-尚硅谷-小程序-课程介绍.mp4", "01-尚硅谷-小程序-课程介绍-副本.mp4");

        long end = System.currentTimeMillis();

        System.out.println("复制成功！花费的时间为" + (end - start));
    }
}
