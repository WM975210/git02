package com.month_3.test_326;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
    tcp协议实现服务端 : 基本流程
        1.构建我是服务端  ServerSocket(int port)
        2.阻塞式监听 Socket accept() 侦听对此套接字的连接并接受它。
        3.IO操作
            1)获取输入流
            2)读入数据
            3)处理数据
            4)关闭
        4.关闭
 */
public class Server_2612 {
    public static void main(String[] args) throws IOException {
        System.out.println("----我是服务端---------");
        //1.构建我是服务端  ServerSocket
        ServerSocket server = new ServerSocket(8989);
        //2.阻塞式监听 Socket accept()
        Socket client = server.accept();
        System.out.println("----一个客户端连接成功---------");
        //3.IO操作
        DataInputStream is = new DataInputStream(client.getInputStream());
        String str = is.readUTF();
        System.out.println(str);
        //4.关闭
        is.close();
        client.close();
        server.close();
    }
}
