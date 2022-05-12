package com.month_3.test_312;

public class Test_1201 {
    public static void main(String[] args) {
        // 多态    向上转型就是多态    多态 变量找父类    方法找子类
        Animal1 an=new Dog2();
        System.out.println(an.type);  // 边牧， 多态的变量找父类
        an.show();  // 多态中 子类没有  继承父类的
        an.tr();   //   子类中重写  找子类

        //  an.m();  多态中，父类的引用 对子类 新增的独有方法 不可见， 没办法调用，如果要调用 需要向下转型
    }
}
// 父类
class Animal1{
    String type="边牧";// 品种

    public void show(){
        System.out.println(type+"看小孩");
    }
    public void tr() {
        System.out.println(type + "在转圈圈");
    }
}
//子类 继承
class Dog2 extends Animal1{
    String name ="七月";
    public void tr(){
        System.out.println(name+"在奔跑");
    }

    /*public void m(){
        System.out.println(name+"在奔跑");
    }*/
}





