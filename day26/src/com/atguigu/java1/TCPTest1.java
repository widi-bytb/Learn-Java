package com.atguigu.java1;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 实现TCP的网络编程
 * 例子1：客户端发送信息给服务端，服务端将数据显示在控制台上
 *
 *
 *
 * */
public class TCPTest1 {

    //    客户端
    @Test
    public void client() {
        Socket socket = null;
        OutputStream os = null;
        try {
//            1.创建Socket对象，指明服务端的IP和端口号
            InetAddress inet = InetAddress.getByName("127.0.0.1");

            socket = new Socket(inet, 8899);
//            2.获取一个输出流，用于输出数据
            os = socket.getOutputStream();
//            3.写出数据的操作
            os.write("你好，我是客户端".getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
//            4.资源的关闭
            if (os != null) {

                try {
                    os.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (socket != null) {

                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }

    //    服务端
    @Test
    public void server() {

        ServerSocket serverSocket = null;
        Socket accept = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
//            1.创建服务端的ServerSocket，指明自己的端口号
            serverSocket = new ServerSocket(8899);
//            2.调用accent()表示接收来自客户端的socket
            accept = serverSocket.accept();
//            3.获取一个输入流
            is = accept.getInputStream();

//        不建议这样写，可能会有乱码
        /*byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1) {
            String str = new String(buffer, 0, len);
            System.out.print(str);
        }*/
//            4.读取输入流的数据
            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
            System.out.println(baos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
//            4.资源的关闭
            if (baos != null) {
                try {
                    baos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (accept != null) {
                try {
                    accept.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
