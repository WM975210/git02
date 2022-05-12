package com.month_3.test_317;

import java.io.UnsupportedEncodingException;

// String 类.表示字符串,java程序中的所有字符串文字(例如"abc"),都实现为此类的实例
public class Test_1702 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // String() 初始化新创建的String对象,使其表示空字符序列
        String s1=new String();
        System.out.println(s1);  // 空字符

        /*   String(String original)   初始化新创建的String对象，使其表示与参数相同的字符序列;
        * 发现new String(String original) 其实只是创建一个String外壳，
        * 内在的char[]其实是共用的，这说明不管你用new String(String original)
        * 创建多少个对象，只要字符串一样，就会共用char[]，真正的堆存储也会共用，避免了浪费
        */
        String s2=new String("abc");
        System.out.println(s2);  //  abc

        /*   String(char[] value)   分配新的 String ，使其表示当前包含在字符数组参数中的字符序列。
        *是用了数组拷贝，原因也很简单，数组是你传进来的，
        *为了保证String的不可变属性，只能拷贝，不能复用。
        */
        char[] chars={'a','b','c','d','e'};
        String s3=new String(chars);
        System.out.println(s3); // abcde

        /*   String(char[] value, int offset, int count)   分配一个新的 String ，
       *                 数组名,      索引,      截取的数量
       *     其中包含字符数组参数的子数组中的字符。
       */
        String s4=new String(chars,1,3);
        System.out.println(s4);   //  bcd

        //  String(byte[] bytes)   通过使用平台的默认字符集解码指定的字节数组构造新的 String 。
        String str="中国";
        //byte[] arr = str.getBytes(); //utf-8->1汉字3个字节   gbk->1汉字2字节
        byte[] arr=str.getBytes("gbk");
        System.out.println(arr.length); //  gbk->1汉字2字节   "中国" 4个字节

        // 默认使用utf-8, s5 乱码
        String s5=new String(arr);
        System.out.println(s5);

        //String(byte[] bytes, int offset, int length)
        //         数组名,        索引起始,       长度
        // 通过使用平台的默认字符集解码指定的字节子阵列来构造新的 String
        String s6=new String(arr,0,2);
        String s7=new String (arr,0,2,"gbk");
        System.out.println(s6);  // 乱码
        System.out.println(s7); //  中

    }
}
