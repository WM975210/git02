package com.month_3.test_323;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.lang.System;

public class ArrayList_2302 {
    public static void main(String[] args) {
        // 存储学生的容器
        ArrayList<Person> list=new ArrayList<>();
        // 签到使用Scanner模拟
        Scanner sc=new Scanner(System.in);
        System.out.println("开始签到");
        Date end=new Date(System.currentTimeMillis()+60*1000);

        while (true){
            System.out.println("请输入学生的姓名");
            String name =sc.next();
            Person p=new Person(name, new Date());

            list.add(p);

            if (list.size()==5){
                System.out.println("所有人已签到");
                break;
            }

            if (new Date().after(end)){
                System.out.println("到点了，签到结束");
            }

        }

        System.out.println("签到人数"+list.size());
        System.out.println("签到名单"+list);

    }
}
class Person{
    private String name;
    private Date time;

    public Person() {
        super();
    }

    public Person(String name, Date time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}