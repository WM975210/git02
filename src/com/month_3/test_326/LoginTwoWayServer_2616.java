package com.month_3.test_326;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*    tcp协议实现双向服务端 : 基本流程
            1.构建我是服务端
            2.阻塞式监听
            3.IO操作接收客户端数据
            4.处理数据
            5.IO操作将结果响应给客户端
            4.关闭
 */
public class LoginTwoWayServer_2616 {
    public static void main(String[] args) throws IOException {

        System.out.println("----我是服务端---------");

        //1.构建我是服务端  ServerSocket
        ServerSocket server = new ServerSocket(8989);

        //2.阻塞式监听 Socket accept()
        Socket client = server.accept();
        System.out.println("----一个客户端连接成功---------");

        //3.IO操作收客户端数据
        DataInputStream is = new DataInputStream(client.getInputStream());
        String str = is.readUTF();  //username=zhangsan&password=1234    //laopei     1234

        //4.处理数据
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

        //5.IO操作将结果响应给客户端
        DataOutputStream os = new DataOutputStream(client.getOutputStream());
        if("laopei".equals(uname) && "1234".equals(upwd)){
            os.writeUTF("登录成功");
        }else{
            os.writeUTF("登录失败");
        }

        os.flush();

        //4.关闭
        os.close();
        is.close();
        client.close();
        server.close();
    }
}
