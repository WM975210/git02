package com.month_3.test_329;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    java中使用正则
        1.String类中一些支持正则表达式语法的方法
            String[] split(String regex) 将此字符串拆分为给定 regular expression的匹配 项 。
            String replaceAll(String regex, String replacement) 将给定替换的给定 regular expression匹配的此字符串的每个子字符串替换。
            String replaceFirst(String regex, String replacement) 将给定替换的给定 regular expression匹配的此字符串的第一个子字符串替换。
            boolean matches(String regex) 判断此字符串是否与给定的 regular expression匹配。
        2.模式器 Pattern
            匹配器 Matcher
 */
public class Regex_2902 {
    public static void main(String[] args) {
       /* String str1="shanghai.123.nihao";
        // 1.String 类中一些支持正则表达式语法的方法
        // split  分割
        System.out.println(Arrays.toString(str1.split("\\.")));  // [shanghai, 123, nihao]
        // replaceAll 替换
        System.out.println(str1.replaceAll("\\.","*"));  // shanghai*123*nihao

        //boolean matches(String regex) 判断此字符串是否与给定的 regular expression匹配。--->完整匹配
        /*String str2="123shang";
        if (str2.matches("\\d{3}.{5}")){
            System.out.println("匹配！！！");
        }*/

        // 2.模式器  Pattern
        String reg=".{3}(a{1,2}\\d{2})(hello|hi)";
        String str3="asdaa12hello";
        Pattern pattern= Pattern.compile(reg);
        Matcher matcher=pattern.matcher(str3);
        //matches() 要求正则与指定字符串完整匹配返回true,否则返回false
        //System.out.println(matcher.matches());

        // find() 判断是否存在满足条件的子串
        while (matcher.find()){
            // group() 获取当前查找到的子串
            System.out.println("查找到的子串："+matcher.group()+"——->"+matcher.group(0));
            //group(index) 获取当前子串中第几组缓存的内容
            System.out.println("分组缓存内容："+matcher.group(1)+"--->"+matcher.group(2));
        }
    }
}
