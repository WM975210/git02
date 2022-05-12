package com.month_3.test_326;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


/*  多用户登录服务器端:
            通过循环实现,可以实现允许多个客户端访问,可以对多个客户端响应
            但是排序访问
*/
public class MulLoginTwoWayServer_2617 {
    public static void main(String[] args) throws IOException {
        System.out.println("----我是服务端---------");
        //1.构建我是服务端  ServerSocket
        ServerSocket server = new ServerSocket(8989);
        //2.阻塞式监听 Socket accept()
        boolean flag = true;
        while(flag){
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
        }
        server.close();
    }
}

