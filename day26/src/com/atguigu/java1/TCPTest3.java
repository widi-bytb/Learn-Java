package com.atguigu.java1;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 实现TCP的网络编程
 * 例题三：
 * 从客户端发送文件给服务端，服务端保存到本地。并返回“发送成功”给客户端。
 * 并关闭相应的连接
 *
 *
 * */
public class TCPTest3 {

    @Test
    public void client() {
        Socket socket = null;
        OutputStream os = null;
        FileInputStream fis = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 8899);

            os = socket.getOutputStream();

            fis = new FileInputStream(new File("爱情与友情.jpg"));

            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }

//            关闭数据的输出
            socket.shutdownOutput();

            is = socket.getInputStream();

            baos = new ByteArrayOutputStream();

            byte[] buffer1 = new byte[1024];
            int len1;
            while ((len1 = is.read(buffer1)) != -1) {
                baos.write(buffer1, 0, len1);
            }

            System.out.println(baos.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
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
        }
    }


    @Test
    public void server() {
        ServerSocket serverSocket = null;
        Socket accept = null;
        InputStream is = null;
        FileOutputStream fos = null;
        OutputStream os = null;
        try {
            serverSocket = new ServerSocket(8899);

            accept = serverSocket.accept();

            is = accept.getInputStream();

            fos = new FileOutputStream(new File("爱情与友情3.jpg"));

            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }

            os = accept.getOutputStream();

            os.write("接收成功".getBytes());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
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
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
