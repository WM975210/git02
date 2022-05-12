package com.month_3.test_328;

import java.io.IOException;
import java.util.Properties;

/*
    Properties :
        Properties类表示一组持久的属性。 Properties可以保存到流中或从流中加载。 属性列表中的每个键及其对应的值都是一个字符串。
    Properties常用做配置文件使用
    定义使用步骤:
        1.src下新建文件 xx.properties
        2.创建Properties类型的对象
        3.调用load(InputStream|Reader)
        4.根据key获取value  getProperty(key)
 */
public class Properties_2808 {
    public static void main(String[] args) throws IOException {

        Properties pro=new Properties();
        // 从流中加载数据
        pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));

        System.out.println(pro.getProperty("username"));
        System.out.println(pro.getProperty("password"));

    }
}
