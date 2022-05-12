package com.month_3.test_321;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    List: 有序集合 （ 也成为序列 ）
 */
public class Test_2105 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList();
        // 添加
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list); // [1, 2, 3]

        //void add(int index, E element) 将指定元素插入此列表中的指定位置（可选操作）。  --只能添加不能修改
        //boolean add(E e) 将指定的元素追加到此列表的末尾（可选操作）。
        list.add(0,0); // 将0添加到0索引处
        System.out.println(list); // [0, 1, 2, 3]
        list.add(2,100); //将索引为2的位置添加个100，后面数据后移
        System.out.println(list);  // [0, 1, 100, 2, 3]

        //E set(int index, E element) 用指定的元素替换此列表中指定位置的元素（可选操作）。 --只能修改不能添加
        list.set(2,0);
        System.out.println(list); // [0, 1, 0, 2, 3]  替换

        //E get(int index) 返回此列表中指定位置的元素。
        System.out.println(list.get(3)); // 返回索引为3的 数据为2

        //int indexOf(Object o) 返回此列表中第一次出现的指定元素的索引，如果此列表不包含该元素，则返回-1。
        list.add(1);
        list.add(2);
        list.add(2);
        System.out.println(list); //  [0, 1, 0, 2, 3, 1, 2, 2]
        System.out.println(list.indexOf(2));  // 返回2这个数字第一次出现的索引数

        //int lastIndexOf(Object o) 返回此列表中指定元素最后一次出现的索引，如果此列表不包含该元素，则返回-1。
        System.out.println(list.lastIndexOf(2));  //  7

        //static <E> List<E> of(E... elements) 返回包含任意数量元素的   不可修改列表。
        List<String> list2=List.of("aaa","bbb","ccc");
        System.out.println(list2); // [aaa, bbb, ccc]
        //list2.set(1,"eee");  //java.lang.UnsupportedOperationException
        System.out.println(list2.get(1)); // 索引1位置  bbb

        //E remove(int index) 删除此列表中指定位置的元素（可选操作）。  -->优先识别
        //boolean remove(Object o) 从该列表中删除指定元素的第一个匹配项（如果存在）（可选操作）。
        System.out.println(list.remove(0)); // 删除了索引为0的数据
        System.out.println(list); // [1, 0, 2, 3, 1, 2, 2]

        //List<E> subList(int fromIndex, int toIndex) 返回指定的 fromIndex （包含）和 toIndex （不包括）之间的此列表部分的视图。
        System.out.println(list.subList(2,5)); // [2, 3, 1]

        System.out.println("-------------------普通for循环-----------------");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("-------------------增强for循环-----------------");
        for(Integer i:list){
            System.out.println(i);
        }
        System.out.println("-------------------iterator迭代器-----------------");
        Iterator<Integer> i=list.iterator();
        while (i.hasNext()){
            Integer is=i.next();
            System.out.println(is);
        }
    }
}
