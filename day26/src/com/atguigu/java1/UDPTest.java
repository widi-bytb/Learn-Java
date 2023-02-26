package com.atguigu.java1;


import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * UDP协议的网络编程
 *
 *
 *
 * */
public class UDPTest {
    @Test
    public void send() {

        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket();

            String str = "我是UDP方式发送的导弹";
            byte[] data = str.getBytes();
            InetAddress inet = InetAddress.getLocalHost();
            DatagramPacket packet = new DatagramPacket(data, 0, data.length, inet, 8899);
            socket.send(packet);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }

    @Test
    public void receiver() {

        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket(8899);

            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length);

            socket.receive(packet);

            System.out.println(new String(packet.getData(), 0, packet.getLength()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (socket != null) {

                socket.close();
            }
        }

    }
}
