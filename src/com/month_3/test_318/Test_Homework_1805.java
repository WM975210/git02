package com.month_3.test_318;
// D把字符串的首字母转成大写，其他小写
public class Test_Homework_1805 {
    public static void main(String[] args) {
        // 定义一个字符串
        String s="shangHAI";

        // 获取第一个字符
        String s1=s.substring(0,1);
        // 获取除了第一个以外的字符
        String s2=s.substring(1);
        // 把第一个字符转成大写
        String s3=s1.toUpperCase();
        // 将后面字母转成小写
        String s4=s2.toLowerCase();
        // 拼接
        String s5=s3.concat(s4);
        System.out.println(s5);
    }
}
