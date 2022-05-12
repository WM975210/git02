package com.month_3.test_315;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*
            练习: 定义员工类型,存储多个员工类型的数据
            1.展示输出所有员工信息
            2.找到所有员工的姓名存储起来
            3.找到所有薪资>10000的员工->裁员
            4.所有同学的年龄中,出现了几种不同的年龄
     */
public class Test_1506 {
    public static void testEmp(){
        Test_1505[] arr=new Test_1505[]{
                new Test_1505("张小小",20,9900),
                new Test_1505("李葵",25,11000),
                new Test_1505("王良",22,8000),
        };
        // 1.展示输出所有员工信息
        for(Test_1505 t:arr){
            System.out.println(t);
        }
        // 2.找到所有员工的姓名存储起来
        String[] names = new String [arr.length];
        // i 作为原数组索引，同时作为新数组索引
        for(int i=0;i<arr.length;i++){
            names[i]=arr[i].getName();
        }
        System.out.println(Arrays.toString(names));
        // 3.找到所有薪资>10000的员工->裁员
        // 集合（存储多个数据）
        //ArrayList: 长度可以跟随数据的增删进行改动，存储任意类型的数据，存在索引，可以根据索引操作
        boolean flag=false; // 标识
        // 循环判断原始数组中是否存在要裁员的数据
        for(Test_1505 e:arr){
            if(e.getSalary()>10000){
                flag=true;
                break;
            }
        }
        // 存在要裁员的员工
        if(flag){
            // 创建一个ArrayList,存储要保留的员工数据
            ArrayList list = new ArrayList();
            // 遍历原数组，拿到每一个要保留的员工被放入ArrayList
            for(Test_1505 e:arr){
                if(e.getSalary()<=10000){
                    list.add(e);
                }
            }
            System.out.println(list.toString());
        }else{
            System.out.println("没有要裁员的员工");
        }
        // 4.所有同学的年龄中,出现了几种不同的年龄
        HashSet set=new HashSet();
        for(Test_1505 e:arr){
            set.add(e.getAge());
        }
        System.out.println(set);
        System.out.println(set.size()); // 集合中数据的个数
    }
}
