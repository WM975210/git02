package com.month_3.test_326;

import com.sun.security.jgss.GSSUtil;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/*
     Socket 套接字
        是传输层为应用层开辟的一个小口子
        不同协议下Socket实现不同
        面向Socket编程

        UDP协议实现基础的发送端 :
        1.定义我是发送端 DatagramSocket(int port) 构造一个数据报套接字并将其绑定到本地主机上的指定端口。
        2.准备数据
        3.数据打包
        4.发送端发送包裹  void send(DatagramPacket p) 从此套接字发送数据报包。
        5.关闭
 */
public class Send_2609 {
    public static void main(String[] args) throws IOException {
        System.out.println("----------------发送端---------------");
        //1.定义我是发送端 DatagramSocket(int port) 构造一个数据报套接字并将其绑定到本地主机上的指定端口。
        DatagramSocket sendSocket = new DatagramSocket(9999);

        //2.准备数据
        byte[] arr="你好".getBytes();

        //3.数据打包
        //DatagramPacket(byte[] buf, int length, SocketAddress address) 构造数据报包，
        // 用于将长度为 length的数据包发送到指定主机上的指定端口号
        DatagramPacket packet = new DatagramPacket(arr,0,arr.length,new InetSocketAddress("localhost",9898));

        //4.发送端发送包裹  void send(DatagramPacket p) 从此套接字发送数据报包。
        sendSocket.send(packet);

        //5.关闭
        sendSocket.close();
    }
}
