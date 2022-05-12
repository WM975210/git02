package com.month_3.test_314;
/*
*    静态内部类
*/
public class Test_1407 {

    private int i=1;
    private static int j=2;

    //  静态内部类
    static class Inner{
        int a=100;  // 成员变量
        static int b=200;  // 静态变量
        //  成员方法
        public void test(){
            System.out.println(a); // 静态内部类中，可以调用静态内部类中的变量
            System.out.println(b); // 静态环境中，可以调静态变量

            //静态内部类中，调用外部类的成员，需要通过外部类的对象
            System.out.println(new Test_1407().i);
            System.out.println(j);// 可以直接调用外部静态内容
        }
        // 静态方法
        public static void testStatic(){
            Inner in=new Inner(); //静态方法调用静态内部类  需要创建对象
            System.out.println(in.a);  // 之后通过对象名 调用

            System.out.println(new Test_1407().i);//静态方法调用外部成员变量  创建对象
            System.out.println(j); // 静态方法可以直接调用外部的静态变量
        }
    }
    // 外部类的成员方法
    public void outer(){
        System.out.println(Inner.b); //外部类可以通过 静态内部类名.静态变量名 调用
        Inner.testStatic();  // 通过静态内部类名.静态方法名调用

        new Inner().test();  // 创建对象调用 静态内部类中的成员方法
    }
}
