package com.month_3.test_321;

import java.util.ArrayList;

/*
        ArrayList  实现所有可选列表操作，并允许所有元素，包括null
 */
public class Test_2107 {
    public static void main(String[] args) {
        ArrayList<Double> list=new ArrayList<>();
        list.add(1.1);
        list.add(2.2);
        list.add(3.3);
        list.add(null);
        list.add(null);

        System.out.println(list);

        // 遍历集合中的每一个数据，输出打印
        list.forEach(System.out::println);
    }
}
