package com.month_3.test_326;

import java.net.InetSocketAddress;

/*
    端口 : port
        区分软件
    0~65535表示端口号 2个字节
    统一协议下端口号不能冲突
    8000以下端口不建议使用,预留端口号
    常见的端口号:
        80 : http
        8080 : tomcat
        1521 : Oracle
        3306 : Mysql

    InetSocketAddress 此类实现IP套接字地址（IP地址+端口号）
 */
public class Port_2607 {
    public static void main(String[] args) {
        //InetSocketAddress(String hostname, int port) 根据主机名和端口号创建套接字地址。
        //InetSocketAddress(InetAddress addr, int port) 根据IP地址和端口号创建套接字地址
        InetSocketAddress address=new InetSocketAddress("192.168.1.6",8888);
        System.out.println(address);

        //InetAddress getAddress() 获取 InetAddress 。
        //String getHostName() 获取 hostname 。
        //int getPort() 获取端口号。
        System.out.println(address.getAddress().getHostName());  // LAPTOP-KQ2GMH76
        System.out.println(address.getPort()); // 8888

    }
}
