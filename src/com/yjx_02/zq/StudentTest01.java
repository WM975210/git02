package com.yjx_02.zq;
//  创建多个对象
public class StudentTest01 {
    public static void main(String[] args) {
        // 创建第一个对象
        Student s1=new Student();  // 创建对象
        s1.name="张小小";  //  成员变量
        s1.age=19;
        System.out.println(s1.name+","+s1.age);
        s1.study();  // 调用 成员方法
        s1.doHomework();

        System.out.println(); // 空格

        //创建第二个对象  并使用
        Student s2=new Student();
        s2.name="张曼玉";
        s2.age=20;
        System.out.println(s2.name+","+ s2.age);

        s2.study();  // 调用 成员方法
        s2.doHomework();


    }
}
