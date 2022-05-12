package com.month_3.test_319;

import java.io.*;

//  功能流  字节输入输出缓冲流
public class Test_IO_1905 {
    public static void main(String[] args) throws IOException {
        //  构建流
        InputStream is=new BufferedInputStream(new FileInputStream("D://test.txt"));
        OutputStream os=new BufferedOutputStream(new FileOutputStream("D://test1.txt"));

        //  读入写出
        byte[] car=new byte[1024];
        int len=-1;
        while((len=is.read(car))!=-1){
            os.write(car);
        }
        //  刷出
        os.flush();

        // 关闭
        os.close();
        is.close();

    }
}
