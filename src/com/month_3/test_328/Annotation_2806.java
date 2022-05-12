package com.month_3.test_328;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
    原注解 : 注解注解的注解
         @Target 用于描述注解的使用范围（即：被描述的注解可以用在什么地方）
         @Retention 表示需要在什么级别保存该注释信息，用于描述注解的生命周期（即：被描述的注解在什么范围内有）
         @Documented 表示使用该注解的元素应被javadoc或类似工具文档化
         @Inherited 表示一个注解类型会被自动继承，
 */

public class Annotation_2806 {
    @HaHa
    int i = 1;
    @HaHa
    public static void main(String[] args) {


    }

    @Override
    public String toString() {
        return "Class002_Annotation{" +
                "i=" + i +
                '}';
    }
}

// @Target({ElementType.METHOD,ElementType.FIELD})
@Target({ElementType.METHOD,ElementType.FIELD})


//@Retention(RetentionPolicy.RUNTIME)
@Retention(RetentionPolicy.RUNTIME)


//@interface HaHa{}
@interface HaHa{}