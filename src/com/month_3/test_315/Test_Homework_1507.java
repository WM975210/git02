package com.month_3.test_315;

import java.util.Scanner;

/*数组查找操作：定义一个长度为10 的一维字符串数组，在每一个元素存放一个单词；然后运行时从命令行输入一个单词，
              程序判断数组是否包含有这个单词，包含这个单词就打印出“Yes”，不包含就打印出“No”。
*/
public class Test_Homework_1507 {
    public static void main(String[] args) {
        String arr [] =new String[10];
        arr[0]="aa";
        arr[1]="bb";
        arr[2]="cc";
        arr[3]="dd";
        arr[4]="ee";
        arr[5]="ff";
        arr[6]="gg";
        arr[7]="hh";
        arr[8]="ii";
        arr[9]="jj";

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要查找的单词：");

        String str=scanner.next();
        boolean flag=false;
        for(String s:arr){
            if(s.equals(str)){
                flag=true;
            }
        }
        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
