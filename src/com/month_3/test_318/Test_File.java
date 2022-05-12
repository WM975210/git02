package com.month_3.test_318;

import java.io.File;

/*
    File: 文件和目录路径名的抽象表示
        java.io.File
     表示路径的字符串中，路径的分隔符可以使用\\  .  /  .  // ，  但是在系统目录中默认使用 \ 表示路径分隔

 */
public class Test_File {
    public static void main(String[] args) {
        // File(String pathname) 通过将给定的路径名字字符串转换为抽象路径来创建新队的File实例
        File file1=new File("D://");
        File file2=new File("D://BBB/text.text");
        File file3=new File("text.txt");

        // File(String parent,String child) 从父路径名 字符串和子路径名 字符串创建新的File 实例
        File file4=new File("D//AAA","text.txt");

        // File(File parent,String child) 从父抽象路径名和子路径名字符串创建新的File实例
        File file5=new File(file1,"text.txt");


        System.out.println(file1);  //  D:\
        System.out.println(file2); // D:\BBB\text.text
        System.out.println(file3);  // text.txt
        System.out.println(file4);  //  D\AAA\text.txt
        System.out.println(file5);  //   D:\text.txt

    }
}
