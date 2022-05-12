package com.month_3.test_328;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/*
    通过反射操作成员

 */
public class Member_2804 {
    public static void main(String[] args) throws Exception {
        Employee emp=new Employee();
        testMethod(Employee.class,emp);
    }

    /*
        操作方法
            1.获取方法
                方法 getMethod(String name, 类<?>... parameterTypes) 返回 方法对象，该对象反映此 类对象表示的类或接口的指定公共成员方法。
                方法[] getMethods() 返回一个包含 方法对象的数组， 方法对象反映此 类对象所表示的类或接口的所有公共方法，包括由类或接口声明的那些以及从超类和超接口继承的那些。
                方法 getDeclaredMethod(String name, 类<?>... parameterTypes) 返回 方法对象，该对象反映此 类对象表示的类或接口的指定声明方法。
                方法[] getDeclaredMethods() 返回一个包含 方法对象的数组， 方法对象反映此 类对象表示的类或接口的所有已声明方法，包括public，protected，default（package）访问和私有方法，但不包括继承的方法。

            2.调用方法
                Object invoke(Object obj, Object... args) 在具有指定参数的指定对象上调用此 方法对象表示的基础方法。
     */

    public static void testMethod(Class<Employee>cls,Employee emp) throws Exception {
        // 获取所有公共的方法
        Method[] arr=cls.getMethods();
        Arrays.stream(arr).forEach(System.out::println);
        //  获取指定的方法
        Method method= cls.getDeclaredMethod("testPrivate");
        System.out.println(method);
        // 忽略权限
        method.setAccessible(true);
        // 调用方法
        System.out.println(method.invoke(emp));
        // 静态方法 存在返回值   可以跟随对象调用 | 可以跟随类名调用
        for (Method m:arr){
            if ("testStatic".equals(m.getName())){
                // System.out.println(m.invoke(emp,-1000));
                System.out.println(m.invoke(null,-1000));
            }
        }
    }
     /*
        操作属性
            1.获取属性
                字段 getField(String name) 返回 字段对象，该对象反映此 类对象表示的类或接口的指定公共成员字段。
                字段[] getFields() 返回一个包含 字段对象的数组， 字段对象反映此 类对象所表示的类或接口的所有可访问公共字段。
                字段 getDeclaredField(String name) 返回 字段对象，该对象反映此 类对象表示的类或接口的指定声明字段。
                字段[] getDeclaredFields() 返回 字段对象的数组， 字段对象反映由此 类对象表示的类或接口声明的所有字段。

            2.获取属性值
                Object get(Object obj) 返回指定对象上此 字段表示的字段的值。
            3.设置属性值
                void set(Object obj, Object value) 将指定对象参数上此 字段对象表示的字段设置为指定的新值。
     */

    public static void testField(Class<Employee>cls,Employee emp) throws Exception {
        //  获取所有公共的
        Field[] fields=cls.getFields();
        System.out.println(Arrays.toString(fields));
        // 根据属性名称获取指定的属性
        Field field=cls.getDeclaredField("name");
        System.out.println(field);
        // 忽略权限
        field.setAccessible(true);
        field.set(emp,"lisi");
        System.out.println(field.get(emp));
    }








}
