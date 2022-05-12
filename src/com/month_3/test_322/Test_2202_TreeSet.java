package com.month_3.test_322;

import java.util.Iterator;
import java.util.TreeSet;

/*
        TreeSet  查询效率相对高，自动把数据做升序排序
                底层结构为红黑树，由TreeMap维护
                新增一些比较大小相关的方法
 */
public class Test_2202_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> tree=new TreeSet<>();
        tree.add(5);
        tree.add(3);
        tree.add(4);
        tree.add(1);
        tree.add(2);
        System.out.println(tree); // [1, 2, 3, 4, 5]

        TreeSet<Double> tree2=new TreeSet<>();
        tree2.add(3.2);
        tree2.add(2.2);
        tree2.add(5.2);
        tree2.add(1.2);
        tree2.add(.2);
        System.out.println(tree2); // [0.2, 1.2, 2.2, 3.2, 5.2]

        TreeSet<String> tree3=new TreeSet<>();
        tree3.add("bc");
        tree3.add("ab");
        tree3.add("a");
        tree3.add("abc");
        tree3.add("你好");
        tree3.add("123");
        tree3.add("shanghai");
        System.out.println(tree3); // [123, a, ab, abc, bc, shanghai, 你好]


        System.out.println("-----------------foreach---------------");
        for(Double d:tree2){
            System.out.println(d);
        }

        System.out.println("--------------iterator--------------");
        Iterator<Integer> in =tree.iterator();
        while (in.hasNext()){
            System.out.println(in.next());
        }

        /*  注意：TreeSet需要存储相同类型的数据，因为会默认比较排序

        TreeSet t=new TreeSet();
        t.add(2.3);
        t.add("niha");
        t.add(3);
        System.out.println(t);

        */

        System.out.println("-----------------------方法----------------------");
        //E ceiling(E e) 返回此set中大于或等于给定元素的 null元素，如果没有这样的元素，则 null 。
        System.out.println(tree2.ceiling(3.1));  //  3.2

        //E floor(E e) 返回此set中小于或等于给定元素的最大元素，如果没有这样的元素，则 null 。
        System.out.println(tree2.floor(2.4));  // 2.2

        //E first() 返回此集合中当前的第一个（最低）元素。
        System.out.println(tree2.first()); // 0.2

        //E last() 返回此集合中当前的最后一个（最高）元素。
        System.out.println(tree2.last()); // 5.2

        //E higher(E e) 返回此集合中的最小元素严格大于给定元素，如果没有这样的元素，则 null 。
        System.out.println(tree2.higher(3.2)); // 5.2

        //E lower(E e) 返回此集合中的最大元素严格小于给定元素，如果没有这样的元素，则 null 。
        System.out.println(tree2.lower(3.3)); // 3.2

        //E pollFirst() 检索并删除第一个（最低）元素，如果此组为空，则返回 null 。
        System.out.println(tree2.pollFirst()); //删除第一个元素0.2 并返回
        System.out.println(tree2); // [1.2, 2.2, 3.2, 5.2]

        //E pollLast() 检索并删除最后一个（最高）元素，如果此集合为空，则返回 null 。
        System.out.println(tree2.pollLast()); // 删除最后一个元素 5.2 并返回
        System.out.println(tree2);  // [1.2, 2.2, 3.2]


    }
}
