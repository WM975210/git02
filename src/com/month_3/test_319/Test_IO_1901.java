package com.month_3.test_319;
// IO流：数据的读入写出，文件的上传下载

import java.io.*;


public class Test_IO_1901 {
    public static void main(String[] args) throws IOException {

        File src=new File("D://test.txt");
        // FileInputStream(File file) 通过打开与实际文件的链接来创建FileInputStream
        //  该文件由文件系统中的File对象  file命名
        FileInputStream is=new FileInputStream(src);

        //  读入int read（） 每次读入一个字节数，返回读入到的字节，读不到返回-1
       /* int num=is.read();
        System.out.println((char)num);  //  1
        System.out.println((char)(is.read())); // 2
        System.out.println((char)(is.read())); //  3    每次只读一个字节*/

        // 循环读入
       /* int num1 =-1; // 记录每次读到的字节
        while((num1=is.read())!=-1){
            System.out.print((char)num1);  //  123
        }*/

        // 提高效率，每次读入一车（字节数组）的数据
       /* byte[] car=new byte[1024];
        // int read(byte[])  每次读入一个字节数组的数据，返回读入到字节数组中数据的个数，没有读到返回-1
        int len=is.read(car);
        System.out.println(new String(car,0,len));  //  123*/

        //  当内容比较多，需要重复读入，每次读入一个字节数组中的数据   ***********
        byte[] car=new byte[2];
        int len=-1;  // 记录每次读入到数组中数据的个数
        while((len=is.read(car))!=-1){
            System.out.println(new String(car,0,len));  // 12 //3
        }
        //  关闭
        is.close();

    }
}
