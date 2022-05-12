package com.month_3.test_321;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/*
    容器中的接口层次
 */
public class Test_2103 {
    public static void main(String[] args) {
        // 1. 创建集合对象
        Collection collection=new ArrayList();

        Collection col=new ArrayList();

        // 2. 常用方法
        // boolean add(E e) 确保此合集包含指定的元素   添加
        collection.add(123);
        collection.add(false);
        collection.add("上海");
        collection.add('a');
        collection.add(null);
        collection.add(3.14);
        System.out.println(collection); // [123, false, 上海, a, null, 3.14]

        col.add("www");
        col.add("FFF");
        col.add("SSS");
        System.out.println(col); // [www, FFF, SSS]

        // //boolean addAll(Collection<? extends E> c) 将指定集合中的所有元素添加到此集合中（可选操作）。
        collection.addAll(col);
        System.out.println(collection); // [123, false, 上海, a, null, 3.14, www, FFF, SSS]
        System.out.println(col);  // [www, FFF, SSS] 添加到那个集合中  这个集合不影响

       /* //  void clear() 从此集合中删除所有的元素
        col.clear();
        System.out.println(col); //  col 中为空
        // boolean isEmpty() 如果此集合中不包含任何元素，则返回true
        System.out.println( col.isEmpty());
        */

        //boolean contains(Object o) 如果此collection包含指定的元素，则返回 true 。
        System.out.println(collection.contains("上海"));

        //boolean containsAll(Collection<?> c) 如果此集合包含指定集合中的所有元素，则返回 true 。
        System.out.println(collection.containsAll(col));

        //boolean remove(Object o) 从此集合中移除指定元素的单个实例（如果存在）（可选操作）。
        System.out.println(collection.remove(123));
        System.out.println(collection);// [false, 上海, a, null, 3.14, www, FFF, SSS]

        //boolean removeAll(Collection<?> c) 删除此集合的所有元素，这些元素也包含在指定的集合中（可选操作）。
        //boolean retainAll(Collection<?> c) 仅保留此集合中包含在指定集合中的元素（可选操作）。

        col.add("WMM");
        collection.add("你好");
        System.out.println(collection); // [false, 上海, a, null, 3.14, www, FFF, SSS, 你好]
        System.out.println(col); // [www, FFF, SSS, WMM]

        System.out.println(collection.retainAll(col)); // true  collection中 包含col

        //int size() 返回此集合中的元素数。
        //Object[] toArray() 返回包含此集合中所有元素的数组。
        System.out.println(Arrays.toString(collection.toArray())); // [www, FFF, SSS]

        System.out.println("--------------------两种遍历---------------");
        System.out.println("-----------增强foreach-----------");
        for(Object obj:collection){
            System.out.println(obj);
        }

        System.out.println("--------------iterator迭代器-------------");
        //1. 获取迭代器实例，用来遍历指定的集合
        // Iterator<E> iterator() 返回此集合中元素的迭代器
        Iterator it=collection.iterator();
        //2. 判断是否存在下一个数据
        while (it.hasNext()){
            //3. 获取下一个数据
            System.out.println(it.next());
        }
    }
}
