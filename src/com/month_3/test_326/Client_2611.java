package com.month_3.test_326;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/*
    tcp协议下传输数据:
        客户端
        服务器
        基于IO
    tcp协议实现客户端 : 基本流程
        1.构建我是客户端 Socket(String host, int port)  IP+端口号指要连接的服务器的IP与端口
        2.基于IO操作
            1)获取输出流
            2)写出
            3)刷出
            4)关闭
        3.关闭
 */
public class Client_2611 {
    public static void main(String[] args) throws IOException {
        System.out.println("----------我是客户端---------");
        // 1.构建我是客户端 Socket(String host, int port)  IP+端口号指要连接的服务器的IP与端口
        Socket client=new Socket("127.0.0.1",8989);

        // 2.基于IO操作
        DataOutputStream os=new DataOutputStream(client.getOutputStream());
        os.writeUTF("哈哈");
        os.flush();

        //3.关闭
        os.close();
        client.close();
    }
}
