package com.month_3.test_322;

import java.util.*;

/*
       Map  键值对数据的集合   无序，去重
            K键：无序，去重 --> Set
            V值：无序，可重复 --> Collection

        特点：一个key只能对应一个Value
              key相同value覆盖
 */
public class Test_2205 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        //V put(K key, V value) 将指定的值与此映射中的指定键相关联（可选操作）。
        map.put(101,"钢铁侠");
        map.put(103,"蜘蛛侠");
        map.put(102,"绯红女巫");
        map.put(104,"格鲁特");
        map.put(null,null);
        System.out.println(map); // {101=钢铁侠, 102=绯红女巫, 103=蜘蛛侠, 104=格鲁特}

        System.out.println(map.put(104,"灭霸"));// 替换了格鲁特 返回格鲁特
        System.out.println(map); // {101=钢铁侠, 102=绯红女巫, 103=蜘蛛侠, 104=灭霸}
        System.out.println(map.put(105,"美队"));// null

        //V get(Object key) 返回指定键映射到的值，如果此映射不包含键的映射，则返回 null 。
        System.out.println(map.get(102)); // 绯红女巫

        //void clear() 从此映射中删除所有映射（可选操作）。
       // map.clear();
        //System.out.println(map); // {}

        //boolean isEmpty() 如果此映射不包含键 - 值映射，则返回 true 。
        System.out.println(map.isEmpty()); // false

        //boolean containsKey(Object key) 如果此映射包含指定键的映射，则返回 true 。
        System.out.println(map.containsKey(101)); // true

        //boolean containsValue(Object value) 如果此映射将一个或多个键映射到指定值，则返回 true 。
        System.out.println(map.containsValue("蜘蛛侠"));// true

        //static <K,V> Map<K,V> of(K k1, V v1) 返回包含单个映射的不可修改的映射。
        Map<String,Boolean> map2=Map.of("xixi",true,"haha",false);
        System.out.println(map2);  // {xixi=true, haha=false}

        //V remove(Object key) 如果存在，则从该映射中移除键的映射（可选操作）。
        System.out.println(map.remove(101)); // 移除了101 钢铁侠
        System.out.println(map); // {null=null, 102=绯红女巫, 103=蜘蛛侠, 104=灭霸, 105=美队}

        //default V replace(K key, V value) 仅当指定键当前映射到某个值时，才替换该条目的条目。
        System.out.println(map.replace(105,"雷神"));
        System.out.println(map); // {null=null, 102=绯红女巫, 103=蜘蛛侠, 104=灭霸, 105=雷神}

        //int size() 返回此映射中键 - 值映射的数量。
        System.out.println(map.size()); // 5

        // 遍历
        System.out.println("-----------------values---------------");

        Collection<String> values=map.values();
        for(String value:values){
            System.out.println(value);
        }

        System.out.println("----------------keySet----------------");

        Set<Integer> set=map.keySet();
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            Integer key=it.next();
            System.out.println(key+"---->"+map.get(key));
        }

        System.out.println("--------------entrySet----------------");

        Set<Map.Entry<Integer,String>> entrys=map.entrySet();
        for(Map.Entry<Integer,String>entry:entrys){
            System.out.println(entry.getKey()+"--->"+entry.getValue());
        }
    }
}
