package com.month_3.test_326;


import java.io.*;
import java.net.Socket;
/*
    tcp协议实现双向登录客户端 :
        1.构建我是客户端
        2.键盘接收用户名与密码
        3.基于IO操作向服务器发送数据
        4.基于IO操作接收服务器响应的结果
        5.处理结果
        6.关闭
 */
public class LoginTwoWayClient_2615 {
    public static void main(String[] args) throws IOException {

        System.out.println("----我是客户端---------");

        //1.构建我是客户端 Socket(String host, int port)
        Socket client = new Socket("127.0.0.1", 8989);

        //2.键盘接收用户名与密码
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入用户名 : ");
        String username = rd.readLine();
        System.out.println("请输入用户密码 : ");
        String password = rd.readLine();

        //3.基于IO操作向服务器发送数据
        DataOutputStream os = new DataOutputStream(client.getOutputStream());
        //username=zhangsan&password=123
        os.writeUTF("username="+username+"&password="+password);
        os.flush();

        //4.基于IO操作接收服务器响应的结果
        DataInputStream is = new DataInputStream(client.getInputStream());
        String result = is.readUTF();

        //5.处理结果
        System.out.println(result);

        //6.关闭
        is.close();
        os.close();
        rd.close();
        client.close();
    }
}


