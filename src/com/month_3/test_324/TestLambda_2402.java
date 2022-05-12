package com.month_3.test_324;
/*
 * 习题二:
 * 	1)声明函数式接口,接口中声明抽象方法,public String getValue(String str)
 * 	2)声明类 TestLambda,类中编写方法使用接口作为参数,讲一个字符串转成大写,并作为方法的返回值
 *  3)再将一个字符串的第2个和第4个索引位置进行截取子串
 */
public class TestLambda_2402 {
    public static void main(String[] args) {
        System.out.println(strHandler("shanghai",str -> str.toUpperCase()));
        System.out.println(strHandler("shanghai",str -> str.substring(2,5)));
    }
    //功能: 能够对一个字符串,进行某种操作,返回结果
    public static String strHandler (String str,MyFunction m){
        return m.getValue(str);
    }

}

interface MyFunction{
    public String getValue(String str);
}