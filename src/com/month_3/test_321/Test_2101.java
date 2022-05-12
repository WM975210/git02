package com.month_3.test_321;

import java.util.ArrayList;

// 集合
public class Test_2101 {
    public static void main(String[] args) {
        // 容器对象
        ArrayList list=new ArrayList();
        list.add(123);
        list.add("你好");
        list.add(false);
        list.add(3.12);

        System.out.println(list); // [123, 你好, false, 3.12]
        System.out.println(list.size());  //  4
        list.add("上海");
        list.add(3.12);
        System.out.println(list); // [123, 你好, false, 3.12, 上海, 3.12]
        System.out.println(list.size()); // 6

        //  删除数据
        list.remove(0); // 删除索引为0的
        System.out.println(list); // [你好, false, 3.12, 上海, 3.12]

        //  修改数据
        list.set(1,"加油"); //  将索引为1的数据修改为 加油
        System.out.println(list); //  [你好, 加油, 3.12, 上海, 3.12]
    }
}
