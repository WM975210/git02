package com.month_3.test_321;

import java.util.LinkedList;
import java.util.Objects;

/*
    LinkedList
    底层结构： 双向链表
 */
public class Test_2108 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list); // [bbb, ccc, ddd]
        list.addFirst("aaa"); // 在开头添加
        list.addLast("eee"); //  在尾部添加
        System.out.println(list);  // [aaa, bbb, ccc, ddd, eee]

        LinkedList<Person> persons=new LinkedList<>();
        persons.add(new Person("张三",18));
        persons.add(new Person("李四",17));
        persons.add(new Person("张小",19));

        //[Person{name='张三', age=18}, Person{name='李四', age=17}, Person{name='张小', age=19}]
        System.out.println(persons);

        // 判断persons 集合中是否包含 ("张三",18) 数据     // contains  包含
        System.out.println(persons.contains(new Person("张三",18)));


    }
}
class Person{
    private String name;
    private int age;

    // 空构造

    public Person() {
    }

    // 带参构造

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

}
