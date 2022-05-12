package com.month_3.test_324;

import com.month_3.test_322.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
/*
        中间操作 :
        1.过滤 Stream filter(Predicate<? super T> predicate);
        2.去重 distinct()
        比较equals与hashCode()
        3.截取 limit(long) 从第一个开始截取几个
        4.跳过 skip(long) 跳过前n个
        5.排序 sorted() --> 内部比较器
        sorted(Comparator) ->外部比较器
        6.映射 map(Function fun) stream操作的每一个数据都所用于参数函数,映射成一个新的结果,最后返回一个持有所有映射后的新的结果的流
*/
public class Stream_2407 {
    public static void main(String[] args) {
        List<Employee> list=Arrays.asList(
                new Employee(101,"aaa",10000),
                new Employee(106,"bbb",8000),
                new Employee(103,"ccc",11000),
                new Employee(105,"ddd",9000)
        );
        // 获取Stream
        Stream <Employee> stream=list.stream();
        stream=stream.sorted((x,y)->Double.compare(y.getSalary(), x.getSalary()));
        Stream<String> names=stream.map(e->e.getName()).distinct();

       // list.stream().map(e->e.getSalary()).distinct().filter(s->s>=10000).sorted().forEach(System.out::println);
        list.stream().map(e-> e.getSalary()).distinct().sorted().forEach(System.out::println);

        // 终止行为
       // stream.forEach(System.out::println);
        names.forEach(System.out::println);





    }
}
