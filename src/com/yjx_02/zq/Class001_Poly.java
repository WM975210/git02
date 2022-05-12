package com.yjx_02.zq;

public class Class001_Poly {
    public static void main(String[] args) {
        //对应类型数据赋值给对应类型的变量
       // Person1 p = new Person1();
       // Student s = new Student();
        //正常调用 : p或者s调用的成员 : 1)自己类中存在的成员  2)从父类中继承的成员
        //多态
        Person1 ps=  new Student1();
        //多态的调用
        System.out.println(ps.str);

        ps.test();

    }
}
class Person1{
    String str = "父类";

    public void test(){
        System.out.println("Person----> test");
    }
}

class Student1 extends Person1{
    String str = "子类";

    public void test(){
        System.out.println("Student----> test");
    }
}

class Teacher1 extends Person1{
    String str = "子类2";

    public void test(){
        System.out.println("Teacher----> test");
    }
}


