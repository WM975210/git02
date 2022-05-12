package com.month_3.test_322;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
        set:无序，不可重复的，有重复的数据会自动去除
            无序，存放的顺序和内部存储的顺序不一致
 */
public class Test_2201_set {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("2022");
        set.add("上海");
        set.add("nihao");
        set.add(null);
        set.add(null);
        System.out.println(set); // [null, 上海, nihao, 2022]

        System.out.println("-------------foreach------------");
        for (String str:set){
            System.out.println(str);
        }

        System.out.println("--------------iterator迭代器--------------");
        Iterator<String> it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
