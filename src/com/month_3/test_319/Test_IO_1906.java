package com.month_3.test_319;

import java.io.*;

/*
      功能流 ： 字符输入输出缓冲流

      字符输入缓冲流 BufferedReader
      字符输出缓冲流 BufferedWriter

 */
public class Test_IO_1906 {
    public static void main(String[] args) throws IOException {
         // 构建流 ( 输入 输出 )
        BufferedReader rd=new BufferedReader(new FileReader("D://test.txt"));
        BufferedWriter rt=new BufferedWriter(new FileWriter("D://dest.txt"));

        // 读写
        String msg=null;
        while ((msg=rd.readLine())!=null){
            rt.write(msg);

            //rt.newLine(); // 换行符
        }
        //  刷出
        rt.flush();
        //  关闭
        rt.close();
        rd.close();
    }
}
