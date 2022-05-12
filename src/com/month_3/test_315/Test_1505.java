package com.month_3.test_315;

import java.util.Objects;
//   员工类      Test_1506  测试
public class Test_1505 {
    private String name;
    private int age;
    private double salary;

    public Test_1505() {
    }

    public Test_1505(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Test_1505{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test_1505 test_1505 = (Test_1505) o;
        return age == test_1505.age &&
                Double.compare(test_1505.salary, salary) == 0 &&
                Objects.equals(name, test_1505.name);
    }
}
