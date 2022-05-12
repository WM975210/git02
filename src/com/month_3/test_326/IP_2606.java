package com.month_3.test_326;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*    网络编程 :
            IP : 定义节点
            端口 : 区分软件
            URL : 统一资源定位符
            协议 : 标准,规范,规则,合同
            传输层协议 : 互联网中传输数据需要满足传输层协议
            UDP : 相当于写信, 只管写只管邮,协议简单,效率高  不安全  大小限制
            TCP : 相当于打电话, 安全,没有大小限制  *****

            网页编程 : 注重的是上层的应用
            网络编程 : 注重是底层数据的传输

            IP : 定义节点,区分节点(互联网中的电子设备都可以通过IP定义)
            分类: IPV4 ->4个字节->32位  IPV6 ->128位
            192.168.0.0~192.168.255.255 非注册IP,供组织内部使用的IP
            127.0.0.1 ->本地IP
            localhost ->本地域名
            IP->域名 : DNS服务器

            java.net网络包
            InetAddress : 表示IP地址
 */
public class IP_2606 {
    public static void main(String[] args) throws UnknownHostException {
        //static InetAddress getLocalHost() 返回本地主机的地址。
        InetAddress ip=InetAddress.getLocalHost();
        System.out.println(ip); // LAPTOP-KQ2GMH76/192.168.1.6

        //String getHostAddress() 返回文本表示中的IP地址字符串
        System.out.println(ip.getHostAddress()); // 192.168.1.6

        //String getHostName() 获取此IP地址的主机名
        System.out.println(ip.getHostName());  //LAPTOP-KQ2GMH76

        //static InetAddress getByName(String host) 根据主机名称确定主机的IP地址
        InetAddress ip2=InetAddress.getByName("www.baidu.com");
        System.out.println(ip2); // www.baidu.com/36.152.44.95
        System.out.println(ip2.getHostName());  // www.baidu.com
        System.out.println(ip2.getHostAddress());  // 36.152.44.95

        InetAddress ip3=InetAddress.getByName("www.mi.com");
        System.out.println(ip3.getHostAddress());  //  36.156.115.1
    }
}
