package com.month_3.test_319;

import java.io.*;

 //  字节流实现文件拷贝

public class Test_IO_1903 {
    public static void main(String[] args) throws IOException {
        InputStream is=null;
        OutputStream os=null;
        // 构建流 （ 输入流 输出流 ）
        is =new FileInputStream("D://test.txt");
        os=new FileOutputStream("D://DDD//test.txt");

        // 读入 写出
        byte[] car=new byte[1024];
        int len=-1; // 记录每次读到字节数组中数据的个数
        while((len=is.read(car))!=-1){
            os.write(car,0,len);
        }

        //  刷出
        os.flush();

        // 关闭
        if(os!=null){
            os.close();
        }
        if(is!=null){
            is.close();
        }
    }

}
