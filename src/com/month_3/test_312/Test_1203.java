package com.month_3.test_312;

public class Test_1203 {
    public static void main(String[] args) {
        //抽象类不能实例化
        //Develop d=new Develop();

        //具体子类对象
        Java java=new Java();
        java.insert();
        java.sleep();
        java.work();
        java.test();

    }
}

// 父类
abstract class Develop{
    public abstract void work();
    public abstract void sleep();
    public void test(){
        System.out.println("抽象方法的test");
    }
}
// 具体子类
class Java extends Develop{

    @Override
    public void work() {
        System.out.println("后端开发");
    }

    @Override
    public void sleep() {
        System.out.println("边敲代码边睡觉。。。");
    }
    // 新增
    public void insert(){
        System.out.println("java中新增方法");
    }
}
// 抽象子类
abstract class Web extends Develop{
    @Override
    public void work() {
        System.out.println("前端开发");
    }
    // 新增
    public void webInsert(){
        System.out.println("wed 新增");
    }



}