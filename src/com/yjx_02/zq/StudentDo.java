package com.yjx_02.zq;
//  测试学生类
public class StudentDo {

    public static void main(String[] args) {
        // 创建对象
        Student s=new Student();
        //  使用对象
        s.name ="张小小";
        s.age=19;
        System.out.println(s.name+","+s.age);

        s.study();
        s.doHomework();

    }

}
