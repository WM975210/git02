package com.month_3.test_326;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/*
    tcp协议实现服务端 : 基本流程
        1.构建我是服务端
        2.阻塞式监听
        3.IO操作接收客户端数据
            1)获取输入流
            2)读入数据
            3)处理数据
            4)关闭
        4.关闭
 */
public class LoginServer_2614 {
    public static void main(String[] args) throws IOException {
        System.out.println("我是服务端");
        //1.构建我是服务端  ServerSocket
        ServerSocket server=new ServerSocket(8899);

        //2.阻塞式监听 Socket accept()
        Socket client=server.accept();
        System.out.println("一个客户端链接成功");

        //3.IO操作
        DataInputStream is=new DataInputStream(client.getInputStream());
        String str=is.readUTF();
/*
        // 字符串处理第一种方式
        String msg="username="+"zhangsan"+"&password="+"123";
        if (msg.equals(str)){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
*/
        //字符串处理第二种方式 :
        String uname = "";
        String upwd = "";
        String[] arr = str.split("&");
        for(String s:arr){
            String[] arr2 = s.split("=");
            if("username".equals(arr2[0])){
                uname = arr2[1];
            }else if("password".equals(arr2[0])){
                upwd = arr2[1];
            }
        }
        if("zhangsan".equals(uname) && "123".equals(upwd)){

            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }


        //4.关闭
        is.close();
        client.close();
        server.close();
    }
}
