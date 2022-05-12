package com.month_3.test_319;

import java.io.*;

/*  OutputStream  字节流输出流
        FileOutputStream 文件字节输出流 --->  节点流
            目的地为文件
        ByteArrayOutputStream 字节数组输出流 ---> 节点流
 */
public class Test_IO_1902 {
    public static void main(String[] args) throws IOException {
        // 1.构建流，指定目的地
        // FileOutputStream(String name)

        // OutputStream os =new FileOutputStream("D://test.txt");// 默认覆盖原文件中内容
        OutputStream os=new FileOutputStream("D://test.txt",true); // boolean参数-> true为追加  false为覆盖


        // 2.写出
        os.write(97);

        byte[] arr="你好再见".getBytes();
        os.write(arr);

        // 3. 刷出
        os.flush();

        // 4. 关闭
        os.close();


    }
}
