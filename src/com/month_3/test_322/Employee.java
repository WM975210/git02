package com.month_3.test_322;
//  定义一个员工类
public class Employee implements Comparable<Employee>  {
    private String name;
    private int id;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee(String s) {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


   /* @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name); // 1. 根据姓名做升序排序 compareTo 比较
    }
    */

    @Override
    public int compareTo(Employee o) {
        return this.id-o.id; // 2. 根据员工标号升序排序
    }


}
