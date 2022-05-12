package com.month_3.test_326;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/*
    tcp协议实现单向登录客户端 :
        1.构建我是客户端
        2.键盘接收用户名与密码
        3.基于IO操作向服务器发送数据
            1)获取输出流
            2)写出
            3)刷出
            4)关闭
        3.关闭
 */
public class LoginClient_2613 {
    public static void main(String[] args) throws IOException {
        System.out.println("我是客户端");

        //1.构建我是客户端 Socket(String host, int port)
        Socket client=new Socket("127.0.0.1",8899);
        //2.键盘接收用户名与密码
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入用户名：");
        String username=rd.readLine();
        System.out.println("请输入用户密码：");
        String password=rd.readLine();

        //3.基于IO操作
        DataOutputStream os=new DataOutputStream(client.getOutputStream());
        //username=zhangsan&password=123
        os.writeUTF("username="+username+"password"+password);
        os.flush();

        // 4.关闭
        os.close();
        rd.close();
        client.close();
    }
}
