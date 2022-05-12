package com.month_3.test_322;

import java.util.Objects;

/*
       HashSet:底层结构：哈希表（数组+链表+红黑树） 底层是由HashMap维护
                特点是查询、增删效率高，去重、无序
                此实现不同步

                去重：数据的类型要求重写hashCode与equals方法

 */
public class Test_2204 {
    public static void main(String[] args) {
        System.out.println("abc".hashCode());// 字符串"abc"的哈希码为 96354

        System.out.println(new Person("zhangsan",18).hashCode());
        System.out.println(new Person("zhangsan",18).hashCode());

        // 若是整数，hashCode方法返回值就是数值的本身 ，Integer重写了hashCode
        System.out.println(new Integer(105).hashCode());
    }
}
class Person{
    private String name;
    private int age;

    // 带参构造
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 重写 equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    // 重写 hashCode 根据成员变量的值去计算 比较是否相等，相等去重
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
