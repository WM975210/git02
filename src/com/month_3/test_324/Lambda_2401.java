package com.month_3.test_324;

import java.util.*;

/*
 * 题一:调用Collections.sort()方法,通过定值排序比较两个Employee(先按年龄比,年龄相同按姓名比),使用Lambda作为参数传递
 * 分析:
 * 	1.定制排序:指自定义比较器|定制排序
 * 	      自然排序:内部比较器|自然排序
 *  2.先比较年龄,年龄相同才比较姓名
 *
 * 注意: 函数式接口作为形参,lambda表达式作为实参,将行为作为参数传递
 */
public class Lambda_2401 {
    public static void main(String[] args) {
        List<Emplouee> list =Arrays.asList(
                new Emplouee("张*",22,10000),
                new Emplouee("王*",25,12000),
                new Emplouee("周*",23,9000)
        );
        System.out.println(list);

        //Collections.sort()方法
        //sort(List<T> list, Comparator<? super T> c)  将一个list集合,根据指定的规则做升序排序
        Collections.sort(list,(x,y)->{
            if (x.getAge()==y.getAge()){
                return y.getName().compareTo(x.getName());
            }
            return Integer.compare(y.getAge(),x.getAge());
        });
        System.out.println(list);


    }
}
class Emplouee implements Comparable<Emplouee>{
    private String name;
    private int age;
    private int salsry;

    public Emplouee() {
    }

    public Emplouee(String name, int age, int salsry) {
        this.name = name;
        this.age = age;
        this.salsry = salsry;
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

    public int getSalsry() {
        return salsry;
    }

    public void setSalsry(int salsry) {
        this.salsry = salsry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emplouee emplouee = (Emplouee) o;
        return age == emplouee.age &&
                salsry == emplouee.salsry &&
                Objects.equals(name, emplouee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salsry);
    }

    @Override
    public String toString() {
        return "Emplouee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salsry=" + salsry +
                '}';
    }

    @Override
    public int compareTo(Emplouee o) {
        if (this.age==o.age){
            return this.name.compareTo(o.name);
        }
        return Integer.compare(this.age,o.age);
    }
}
