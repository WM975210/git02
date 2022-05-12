package com.month_3.test_326;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
    多用户登录服务器端:
        通过多线程实现
 */
public class MulLoginTwoWayServer_2618 {
    public static void main(String[] args) throws IOException {
        System.out.println("----我是服务端---------");

        //1.构建我是服务端  ServerSocket
        ServerSocket server = new ServerSocket(8989);

        //2.阻塞式监听 Socket accept()
        boolean flag = true;
        while(flag){
            Socket client = server.accept();
            System.out.println("----一个客户端连接成功---------");

            //开启线程为客户端服务
            new Thread(new Channel(client)).start();
        }
        server.close();
    }

    static class Channel implements Runnable{
        private Socket client = null;
        private DataInputStream is = null;
        private DataOutputStream os = null;

        public Channel(Socket client) {
            this.client = client;
            try {
                is = new DataInputStream(client.getInputStream());
                os = new DataOutputStream(client.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //读入
        public String read(){
            String str = "";
            try {
                str = is.readUTF();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        //写出
        public void write(String msg){
            try {
                os.writeUTF(msg);
                os.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //关闭
        public void close(){
            if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(client!=null){
                try {
                    client.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override
        public void run() {

            //3.IO操作收客户端数据
            String str = read();

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

            if("laopei".equals(uname) && "1234".equals(upwd)){
                write("登录成功");
            }else{
                write("登录失败");
            }

            //4.关闭
            close();
        }
    }
}
