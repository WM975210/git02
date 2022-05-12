package com.month_3.test_324;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
    函数式接口 :只有一个必须被重写的抽象方法的接口
        @FunctionalInterface 注解强制检测是否为函数式接口
        java.util.function 包下提供了一系列的函数式接口
        四大内置函数式接口 :
        1.   Consumer<T> 消费型接口
                void accept(T t) 对给定的参数执行此操作。
        2.    Function<T,R> 函数型接口
                R apply(T t) 将此函数应用于给定的参数。
        3.    Supplier<T> 供给型接口
                T get() 获取结果。
        4.   Predicate<T> 段言型接口
                boolean test(T t) 根据给定的参数计算此谓词。
 */
public class FunctionalInterface_2404 {
    public static void main(String[] args) {
        //  1 .
        testConsumer(2500.0,m-> System.out.println("健身房充值"+m));
        testConsumer(20000.0,m-> System.out.println("学习！！！"+m));
        //  2.
        System.out.println(strHandler(" 哈哈",s->s.trim()));
        System.out.println(strHandler("youjixian",s->s.toUpperCase()));
        //  3.
        System.out.println(testNumRandom(5,()->(int)(Math.random()*(10-5+1)+5)));
        System.out.println(testNumRandom(10,()->(int)(Math.random()*(20-10+1)+10)));
        //  4.
        System.out.println(list(List.of("钢铁侠","蜘蛛侠","绯红女巫","灭霸"),s ->s.length()>=3));
    }

    // 1.   Consumer<T> 消费型接口  没有返回值
    public static void testConsumer(Double money, Consumer<Double> con){
        con.accept(money);
    }
    // 2.   Function<T,R> 函数型接口
    public static String strHandler(String str, Function<String,String> fun){
        return fun.apply(str);
    }
    // 3.  Supplier<T> 供给型接口
    public static List<Integer> testNumRandom(int num, Supplier<Integer> sup){
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=num;i++){
            list.add(sup.get());
        }
        return list;
    }
    // 4. Predicate<T> 段言型接口
    public static List<String> list (List<String>list, Predicate<String> pre){
        List<String> strs=new ArrayList<>();
        for (String s:list){
            if (pre.test(s)){
                strs.add(s);
            }
        }
        return strs;
    }

}
