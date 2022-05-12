package com.month_3.test_315;
// 数组的遍历
public class Test_1502 {
    public static void main(String[] args) {
        // 字符数组
        char[] arr=new char []{'a','b','c','d'};

        // 普通for 循环，i 是索引
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }

        // 增强for循环   for..each
        for(char ch:arr){
            System.out.println(ch);
        }
    }
}
