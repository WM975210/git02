package com.month_3.test_328;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/*
    通过反射创建对象
        1.Class ->newInstance() 默认调用空构造为对象初始化信息-->不推荐使用
        2.Constructor->newInstance() 创建对象
            1.获取某一个类中构造器
                构造器<T> getConstructor(类<?>... parameterTypes) 返回一个 构造器对象，该对象反映此 类对象所表示的类的指定公共构造函数。
                构造器<?>[] getConstructors() 返回一个包含 构造器对象的数组， 构造器对象反映了此 类对象所表示的类的所有公共构造函数。
                构造器<T> getDeclaredConstructor(类<?>... parameterTypes) 返回一个 构造器对象，该对象反映此 类对象所表示的类或接口的指定构造函数。
                构造器<?>[] getDeclaredConstructors() 返回 构造器对象的数组， 构造器对象反映由此 类对象表示的类声明的所有构造函数。

            2.调用Constructor类提供的newInstance方法,创建对象的时候调用当前构造器初始化信息
 */
public class Constructor_2803 {
    public static void main(String[] args) throws Exception {
        //1.创建对象                   获取空构造
        System.out.println(Employee.class.newInstance()); // Employee{no=0, name='null', sal=0.0, i=1}

        // 获取构造器
        Constructor[] cons=Employee.class.getConstructors();
        System.out.println(Arrays.toString(cons));

        System.out.println("-----------------------------");
        Constructor<Employee> con=Employee.class.getDeclaredConstructor(int.class,String.class);
        System.out.println(con);

        // 2. 创建对象
        //  私有的构造器先忽略权限再使用
        con.setAccessible(true);
        Employee emp=con.newInstance(101,"zhangsan");
        System.out.println(emp);
    }
}
