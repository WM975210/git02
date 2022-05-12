package com.month_3.test_321;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
    定义一个List集合，存储漫威中喜欢的英雄人物，如果存在灭霸（必须存在灭霸），就添加一个惊奇队长
 */
public class Test_2106 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("钢铁侠");
        list.add("美国队长");
        list.add("雷神");
        list.add("灭霸");
        list.add("黑寡妇");

        System.out.println(list); // [钢铁侠, 美国队长, 雷神, 灭霸, 黑寡妇]

        /*//contains（） 包含
        if(list.contains("灭霸")){
            list.add("惊奇队长");
        }
        System.out.println(list); // [钢铁侠, 美国队长, 雷神, 灭霸, 黑寡妇, 惊奇队长]
        */

       /* // 普通for循环遍历
        for(int i=0;i<list.size();i++){
            if("灭霸".equals(list.get(i))){
                list.add("惊奇队长");
            }
        }
        System.out.println(list); // [钢铁侠, 美国队长, 雷神, 灭霸, 黑寡妇, 惊奇队长]
        */

        /*
        //java.util.ConcurrentModificationException  当不允许这样的修改时，检测到对象的并发修改的方法可能抛出此异常。
        // foreach
        for(String s:list){
            if ("灭霸".equals(s)){
                list.add("惊奇队长");
            }
        }
        System.out.println(list);
         */

        /*
        ////java.util.ConcurrentModificationException  当不允许这样的修改时，检测到对象的并发修改的方法可能抛出此异常。
        // iterator  迭代器
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            if ("灭霸".equals(it.next())){
                list.add("惊奇队长");
            }
        }
        System.out.println(list);
        */


        // listIterator 列表迭代器 --> List 新增的迭代方法

        // 1. 获取列表迭代对象
        ListIterator<String> it2=list.listIterator();
        // 2. 循环判断是否存在下一个元素 | 下一个元素

        // 正向遍历
        while (it2.hasNext()){
            // 3. 获取下一个元素 | 下一个元素
            if ("灭霸".equals(it2.next())){
                it2.add("惊奇队长");
            }
        }
        System.out.println(list);

        System.out.println("------------------反向遍历------------------");
        while (it2.hasPrevious()){
            System.out.println(it2.previous());
        }
    }
}
