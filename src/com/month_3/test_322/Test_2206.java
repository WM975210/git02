package com.month_3.test_322;

import java.util.*;

/*
       TreeMap :存储键值对类型的数据，自动升序排序，去重的
            去重与排序：根据键值对的key实现，与value本身无关
 */
public class Test_2206 {
    public static void main(String[] args) {
      //  TreeMap<Teacher,String> map=new TreeMap<>();// 根据key的数据类型Teacher默认比较规则

        // 根据员工标号进行降序排序
        TreeMap<Teacher,String> map=new TreeMap<>((o1, o2)->o2.getNo()-o1.getNo() );


        map.put(new Teacher(01,"李老师","JAVA"),"JAVA");
        map.put(new Teacher(03,"张老师","DB"),"DB");
        map.put(new Teacher(02,"薛老师","JAVA"),"JAVA");
        System.out.println(map);


    }


}
class Teacher implements Comparable<Teacher>{
    private int no;
    private String name;
    private String subject;

    public Teacher() {
    }

    public Teacher(int no, String name, String subject) {
        this.no = no;
        this.name = name;
        this.subject = subject;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return this.no-o.no; //根据编号做升序排序
    }
}