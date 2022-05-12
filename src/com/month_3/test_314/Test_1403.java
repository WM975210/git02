package com.month_3.test_314;
//  内部类
public class Test_1403 {
    //  成员变量  类中方法外
    private int a=10;  // 私有的
    static int b=100;  // 静态的
    //  成员内部类
    class Inner{
        //  成员变量
        int c=20;
        static final int d=200;  // 静态的成员常量
        // 成员方法
        public void testInner(){
            System.out.println(a);
            System.out.println(b);

            System.out.println(c);
            System.out.println(d);
        }
    }
    //  成员方法
    /*
    * 外部类调用成员内部类的成员 ，需要创建内部类对象，跟随对象使用
    */
    public void outer(){
        Inner in=new Inner();
        System.out.println(in.c);
    }
}
