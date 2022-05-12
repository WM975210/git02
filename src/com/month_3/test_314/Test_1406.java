package com.month_3.test_314;
//   私有内部类   只能在本类中使用

public class Test_1406 {
    private int i=1;  // 私有的
    private static int j=2;  // 私有的静态外部变量
    //私有内部类
    private class Inner{
        private int a=10; //私有的内部成员变量
        private static final int b=20; //私有的静态常量

        public void test(){
            System.out.println("私有内部类的成员方法");
            System.out.println(i);
            System.out.println(j);
            System.out.println(a);
            System.out.println(b);
        }
    }
    //外部类的成员方法
    public void outer(){
        // 创建内部类的对象  跟随对象使用
        Inner in =new Inner();
        System.out.println(in.a);
        in.test();
    }
}
