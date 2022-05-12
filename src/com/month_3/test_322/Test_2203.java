package com.month_3.test_322;

import java.util.Comparator;
import java.util.TreeSet;

public class Test_2203 {
    public static void main(String[] args) {
       // TreeSet<Employee> tree=new TreeSet<>();// 1. 根据Employee默认比较规则，自然排序方式做比较排序

       // TreeSet<Employee> tree = new TreeSet<>(new TreeSet<>());  //  2. 根据员工编号做升序排序

       // TreeSet<Employee> tree = new TreeSet<>(new Test()); // 3. 根据员工薪资做升序


        //  4 .  匿名内部类 ： 简化没有类自己作用的实现类
        TreeSet<Employee> com=new TreeSet<>(new Comparator<Employee>() { // 实现类类体
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o2.getSalary(),o1.getSalary()); // 根据薪资做降序
            }
        });

        // 5. Lambda：简化匿名内部类对象，要求必须为函式接口才能简化
        TreeSet<Employee> tree=new TreeSet<>((o1,o2)->o1.getId()-o2.getId()); // 根据id进行升序排序

        tree.add(new Employee(03,"zhangsan",10000));
        tree.add(new Employee(02,"lisi",12000));
        tree.add(new Employee(01,"wangwu",8000));

        System.out.println(tree);



    }
}
//    外部比较器
class Test implements Comparator<Employee>{
    /*
            调用compare方法做两个数据的比较
                compare(t1,t2)
                返回值:
                    =0       t1==t2
                    <0       t1<t2
                    >0       t1>t2
         */
    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.getSalary(),o2.getSalary()); //  3. 根据员工薪资升序排序
    }
}