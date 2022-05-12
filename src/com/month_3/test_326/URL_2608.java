package com.month_3.test_326;

import java.net.MalformedURLException;
import java.net.URL;

/*
    URL : 统一资源定位符,向万维网上的“资源”的指针。
    互联网的三大基石 : URL HTML HTTP

    URL组成:
        1.协议 http
        2.域名 www.baidu.com
        3.端口 80
        4.资源 index.html
        5.数据 username=zhangsan&password=123
        6.锚点 #a

        url : http://www.baidu.com:80/index.html?username=zhangsan&password=123#a
 */
public class URL_2608 {
    public static void main(String[] args) throws MalformedURLException {
        URL url=new URL("http://www.baidu.com:80/index.html?username=zhangsan&password=123#a");
        System.out.println(url); // http://www.baidu.com:80/index.html?username=zhangsan&password=123#a
        System.out.println("协议："+url.getProtocol());  // 协议：http
        System.out.println("域名："+url.getHost());   // 域名：www.baidu.com
        System.out.println("端口："+url.getPort()); // 端口：80
        System.out.println("资源："+url.getFile());  // 资源：/index.html?username=zhangsan&password=123
        System.out.println("文件路径："+url.getPath());  // 文件路径：/index.html
        System.out.println("数据："+url.getQuery()); // 数据：username=zhangsan&password=123
        System.out.println("锚点："+url.getRef()); // 锚点：a
    }
}
