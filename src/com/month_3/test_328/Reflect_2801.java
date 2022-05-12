package com.month_3.test_328;

import java.util.Properties;

/*
    反射 :  动态机制

    Java反射机制，可以实现以下功能：
        ①在运行时判断任意一个对象所属的类；
        ②在运行时构造任意一个类的对象；
        ③在运行时判断任意一个类所具有的成员变量和方法；
        ④在运行时调用任意一个对象的方法；
        ⑤生成动态代理；

    发生在程序运行期间

    反射的源头  : Class类型的对象
 */
public class Reflect_2801 {
    public static void main(String[] args) throws Exception {

        Properties pro=new Properties();

        pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("classname.properties"));
        Person p=(Person)Class.forName(pro.getProperty("className")).newInstance();
        p.eat();
    }
}
class Person{
    void eat(){
        System.out.println("早起喝水");
    }
}
class Student extends Person{
    void eat(){
        System.out.println("早起喝白开水");
    }
}
class Teacher extends Person{
    void eat(){
        System.out.println("早起喝柠檬水..");
    }
}