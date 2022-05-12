package com.month_3.test_319;

import java.io.*;

//  字符流
public class Test_IO_1904 {
    public static void main(String[] args) throws IOException {
        // 构建流 （ 输入 输出 ）
        Reader rd=new FileReader("D://test.txt");
        Writer rt=new FileWriter("D://dest.txt");

        // 读写
        // 读入 int read（） 每次读入一个字符数据
        // 读入 int read（char[] cbuf） 将字符读入数组。返回读取的字符数，如果已到达流的末尾，则返回-1
        char[] car=new char[1024];
        int len=-1; // 记录每次读入到数组中数据的个数
        while ((len=rd.read(car))!=-1){
            rt.write(car,0,len);
        }

        // 刷出
        rt.flush();
        // 关闭
        rt.close();
        rd.close();
    }
}

