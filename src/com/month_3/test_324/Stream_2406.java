package com.month_3.test_324;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

/*
    Stream:数据的渠道，用来操作由数据源（数组，集合）所产生的元素序列
 */
public class Stream_2406 {
    public static void main(String[] args) {
       //  Collection-->stream
       Stream<Integer> str= List.of(1,2,3,4,5).stream();
        System.out.println(str);
        str.forEach(System.out::println);


        // Arrays--> stream (数组)
        Integer[] arr={1997,10,25};
        Stream<Integer> s=Arrays.stream(arr);
        s.forEach(System.out::println);

        String[] str1={"春","夏","秋","冬"};
        Stream<String> m=Arrays.stream(str1);
        m.forEach(System.out::println);

        // Stream.of (值列表)
        Stream<Integer> sm=Stream.of(022,2,14);
        sm.forEach(System.out::println);
    }
}
