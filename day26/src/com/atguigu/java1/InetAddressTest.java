package com.atguigu.java1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * 一、网络编程中有两个主要的问题：
 *   如何准确地定位网络上一台或多台主机；定位主机的特定应用
 *   找到主机后如何可靠高效地进行数据传输
 *
 * 二、网络编程中的两个要素：
 * 对应问题一：IP和端口号
 * 对应问题二：提供网络通信协议TCP/IP参考模型（应用层、传输层、网络层、物理+数据链路层）
 *
 * 三、通信要素一：IP和端口号
 *
 * 1.IP：唯一的标识Internet上的计算机（通信实体）
 * 2.在Java中使用InetAddress类代表IP
 * 3.IP分类：IPV4和IPV6 万维网和局域网
 * 4.域名：
 * 5.本地回路地址：127.0.0.1
 *  端口号：正在计算机上运行的进程
 *  要求：不同的进程有不同的端口号
 *
 * 端口号与IP地址的组合得出一个网络套接字：Socket
 * */
public class InetAddressTest {
    public static void main(String[] args) {

        try {
            InetAddress inet1 = InetAddress.getByName("192.168.10.14");

            System.out.println(inet1);

            InetAddress inet2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inet2);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
