package com.month_3.test_323;

import java.util.*;

/*
    Map 无序的 去重的  迭代器联系
 */
public class Test_2301_Map {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();

        map.put("春","万物复苏");
        map.put("夏","烈日炎炎");
        map.put("秋","金风送爽");
        map.put("冬","万物凋零");
        System.out.println(map);

        System.out.println("-------------values-----------");
        Collection<String> v= map.values();
        for (String value:v){
            System.out.println(value);
        }

        System.out.println("----------keySet-----------");

        /*
        Set<String> s=map.keySet();
        for(String set:s){
            System.out.println(set);
        }
        */

        Set<String> set=map.keySet();
        Iterator<String> it=set.iterator();
        while (it.hasNext()){
            String key=it.next();
            System.out.println(key+"-->"+map.get(key));
        }

        System.out.println("------------entrySet------------");
        Set<Map.Entry<String,String>> s=map.entrySet();
        for(Map.Entry<String,String> entry:s){
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }
    }
}
