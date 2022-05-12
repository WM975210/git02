package com.month_3.test_315;

// 数组
public class Test_1501 {
    public static void main(String[] args) {
        // 动态初始化  声明
        int [] a;
        // 为数组初始化
        a =new int[3]; // 只创建，不赋值，有默认值  整数默认值是 0
        // 为数组赋值
        a[0]=1;
        a[1]=2;
        a[2]=3;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);


        // 静态初始化
        double [] b =new double[]{3.5,4.8,2.9};
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

        // 动态字符串
        String []s =new String[]{"上海","你好"};
        System.out.println(s[0]);
        System.out.println(s[1]);

        // 为数组a重新赋值
        a=new int[5];
        a=new int[]{9,8,7,6,5};
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);

    }
}
