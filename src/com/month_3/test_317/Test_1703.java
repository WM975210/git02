package com.month_3.test_317;

import java.util.Arrays;

//  String 常用方法
public class Test_1703 {
    public static void main(String[] args) {
        String str="jintiannikuailema";
        String str2="Jintiannikuailema";

        //boolean isBlank() 如果字符串为空或者空字符 返回true, 否则返回false
        System.out.println("".isBlank()); // true
        System.out.println("  ".isBlank()); // true
        System.out.println("a".isBlank()); // false

        // boolean isEmpty() 字符串中没有内容是true,有内容即使是空 返回false
        System.out.println("".isEmpty()); // true
        System.out.println(" ".isEmpty());  // false

        // int length()  返回字符串的长度
        System.out.println(str.length()); //  17
        System.out.println("你好".length()); //  2

        // String repeat(字符串.repeat(数量));
        //返回一个字符串,重复返回 数量的 次数
        System.out.println("abc".repeat(5));

        // String replace(原来字母,替换新的字母) 全部替换
        System.out.println(str.replace("a","A"));

        //String replaceFirst(原来字母,替换字母)  只替换指定字母的第一个
        System.out.println(str.replaceFirst("a","A"));

        // String[] split(分割条件) 将字符串分割
        System.out.println(Arrays.toString("username=zhangxiao".split("=")));  // [username, zhangxiao]

        // String trim() 删除前后空格,只针对半角空格
        System.out.println(" nihao  ".trim());
        // String strip() 删除前后所有空格,半角全角都能删除
        System.out.println(" nihao  ".strip());
        System.out.println(" nihao  ".stripLeading()); // 删除 前导 (前面空格)  半角全角都能删除
        System.out.println(" nihao  ".stripTrailing());  // 删除尾随  (空面空格) 半角全角都能删除

        // substring (索引) 从此索引 截取到最后
        System.out.println(str.substring(5));  // annikuailema


        // substring(截取的索引开始,索引结束)
        System.out.println(str.substring(5,12));  //  annikua

        //  char [] toCharArray()  将此字符串转为新的字符数组
        System.out.println(Arrays.toString(str.toCharArray()));

        // Sring toUpperCase()  将字符串小写转为大写
        System.out.println(str.toUpperCase());
        // Sring toLowerCase()  将字符串大写转为小写
        String str3="SHANGHAI";
        System.out.println(str3.toLowerCase());

        // static String valueOf() 返回boolean 参数的字符串表示形式
        // static String valueOf() 返回int 参数的表示形式
        System.out.println(String.valueOf(false));
        System.out.println(String.valueOf(1));


    }
}
