package com.month_3.test_329;

import java.util.Arrays;

/*    正则表达式:  了解
            用正则的语法来描述具有特殊规则字符串
            是一个门语言,具有自己的语法

            作用:
            查找,匹配,校验,分隔...
            目标:
            简单的可以手写,复杂的能看懂,稍作修改
*/
public class Regex_2901 {
    public static void main(String[] args) {
        String s="wangmeng8shanghai8beijing5manjing";
        String[] arr=s.split("\\d"); // 以数字位置将字符串分隔

        System.out.println(Arrays.toString(arr)); // [wangmeng, shanghai, beijing, manjing]
    }
}
