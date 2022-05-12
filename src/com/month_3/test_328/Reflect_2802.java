package com.month_3.test_328;

import jdk.swing.interop.SwingInterOpUtils;

import java.nio.channels.ClosedSelectorException;

/*
    反射的源头 :
        Class对象
        1.类名.class
        2.Class.forName(权限定名) 权限定名: 包名.类名 -->  推荐
        3.对象.getClass()
 */
public class Reflect_2802 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1. 类名.class
        Class<String> cls1=String.class;
        System.out.println(cls1);   // class java.lang.String

        // 2. Class.forName(权限定名)
        Class cls2=Class.forName("java.lang.String");
        System.out.println(cls2);  // class java.lang.String
        System.out.println(cls1==cls2);  //true

        // 3.对象.getClass()
        Class cls3="".getClass();
        System.out.println(cls3);  // class java.lang.String

        //获取当前Class对象所表示类型的父类的Class对象
        Class cls4=cls1.getSuperclass();
        System.out.println(cls4);  // class java.lang.Object
        System.out.println(Object.class==cls4);  // true

        // 获取基本数据类型的Clas对象
        System.out.println(int.class);  // int
        System.out.println(Integer.class);  // class java.lang.Integer
        System.out.println(int.class==Integer.TYPE);  // true

        System.out.println(Double.TYPE); // double

    }
}
