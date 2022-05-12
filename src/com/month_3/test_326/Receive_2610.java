package com.month_3.test_326;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/* UDP协议实现基础的接收端 :
            1.定义我是接收端
            2.准备包裹用来接收数据
            3.接收端接收数据
            4.处理数据
            5.关闭
*/
public class Receive_2610 {
     public static void main(String[] args) throws IOException {
         System.out.println("---------------接收端------------");
         //1.定义我是接收端
         DatagramSocket receiveSochet=new DatagramSocket(9898);

         //2.准备包裹用来接收数据
         byte[]arr=new byte[1024];
         DatagramPacket packet=new DatagramPacket(arr,0,arr.length);

         //3.接收端接收数据
         receiveSochet.receive(packet);

         //4.处理数据
         //byte[] getData() 返回数据缓冲区。
         //int getLength() 返回要发送的数据的长度或接收的数据的长度
         byte[] result=packet.getData();
         int len=packet.getLength();
         System.out.println(new String(result,0,len));

         //5.关闭
         receiveSochet.close();
     }
}
