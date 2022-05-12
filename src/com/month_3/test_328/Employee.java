package com.month_3.test_328;

public class Employee {
    private int no;
    private String name;
    private double sal;

    public int i=1;
    public static int j=2;

    public Employee() {
    }

    public Employee(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Employee(int no, String name, double sal) {
        this.no = no;
        this.name = name;
        this.sal = sal;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                ", i=" + i +
                '}';
    }
    // 静态方法
    public static boolean testStatic(int i){
        System.out.println("静态方法testStatic");
        return i>0;
    }
    // 私有方法
    private void testPrivate(){
        System.out.println("私有方法Private");
    }
}
