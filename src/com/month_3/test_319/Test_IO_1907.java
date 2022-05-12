package com.month_3.test_319;

import java.io.*;

/*
    功能流 ： Data流
            是字节流的功能流
 */
public class Test_IO_1907 {
    public static void main(String[] args) throws IOException {
      //  wirte("D://test.txt");  l
        read("D://test.txt");

    }
    // 写出
    public static void wirte(String path) throws IOException {
        //  1. 构建输出流
        DataOutputStream os=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(path)));
        //  2. 准备数据
        int i=100;
        char ch='a';
        boolean flag=false;
        String str="哈哈";
        // 3. 写出
        os.writeInt(i);
        os.writeChar(ch);
        os.writeBoolean(flag);
        os.writeUTF(str);

        // 4. 刷出
        os.flush();

        // 5. 关闭
        os.close();
    }

    //  读入
     public static void read(String path) throws IOException {
        // 1. 构建输出流
         DataInputStream is=new DataInputStream(new BufferedInputStream(new FileInputStream(path)));
         // 2. 读入
         int i=is.readInt();
         char ch=is.readChar();
         boolean flag=is.readBoolean();
         String msg=is.readUTF();
         //  3. 处理数据
         System.out.println(i);
         System.out.println(ch);
         System.out.println(flag);
         System.out.println(msg);
         // 4. 关闭
         is.close();
     }

}
