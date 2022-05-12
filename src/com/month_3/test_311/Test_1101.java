package com.month_3.test_311;

public class Test_1101 {
    // private 私有的
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("小小");
        s.setAge(18);
        s.show();  //  调用方法
        System.out.println(s.getAge());
    }
}
//  学生类
class Student{
    // 被private 修饰 私有的  只能在本类中使用
    private String name;
    private int age;

    // 设置器: 为age 设置值
    public void setAge(int age){
        if(age<0||age>30){
            System.out.println(age+"年龄不合格");
            return;
        }
      this.age=age;
    }
    //访问器：获取age的值
    public int getAge(){
        return this.age;
    }
    // 设置器：设置名字
    public void setName(String name){
        this.name=name;
    }
    // 获取名字
    public String getName(){
        return name;
    }
    // 创建空构造
    public Student(){}

    //  成员方法
    public void show(){
        System.out.println(name+","+age);
    }

}