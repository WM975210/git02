package com.month_3.test_324;

import com.month_3.test_322.Employee;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/*
    方法引用 ：： 简化lambda表达式，是lambda的另一种表现形式
    语法：
        对象：：实例方法
        类名：：静态方法
        类名：：实例方法

      构造器引用
            数据类型：：new
 */
public class MethodQuite_2405 {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }
    //  1. 对象 ：：实例方法
    public static void test1(){
       List<Integer> list= List.of(1,2,3,4,5);
        PrintStream ps=System.out;

        // Consumer con=i->System.out.println(i);
        // Consumer con=i->ps.println(i);
        Consumer con=ps::println;
       //list.forEach(con);
       //list.forEach(ps::println);
        list.forEach(System.out::println);
    }

    // 2. 类名：：静态方法
    public static void test2(){
       // Comparator<Integer> com=(x,y)->x-y;
       // Comparator<Integer> com=(x, y)->Integer.compare(x,y);
        Comparator<Integer> com=Integer::compare;
        System.out.println(com.compare(100,101));
    }

    // 3. 类名：：实例方法
    public static void test3(){
       // BiPredicate<String,String> p=(x,y)->x.equals(y);
        BiPredicate<String,String> p=String::equals;
        System.out.println(p.test(new String("shanghai"),"shanghai"));
    }

    // 4. 构造器引用
    public static void test4(){
        //Supplier<Employee> sup=()->new Employee();
        Supplier<Employee> sup=Employee::new;
        System.out.println(sup.get());

       // Function<String,Employee> fun = (s)->new Employee(s);
        Function<String,Employee> fun= Employee::new;
        System.out.println(fun.apply("zhang"));
    }
}

