package com.yjx_02.phone;


//找到打印顺序+结果
public class Class_LianXi {
    public static int a = 0;
    {
        a = 10;
        System.out.println("  、非静态代码块执行a=" + a); // 3、10
    }
    static {
        a = 6;
        System.out.println(" 、静态代码块执行a=" + a); // 1、= 6
    }
    public Class_LianXi() {
        this(a); // 0
        System.out.println(" 、"+a);  // 4、=0
        System.out.println(" 、无参构造方法执行a=" + a); // 5、0 //无参构造方法执行a=10
    }
    public Class_LianXi(int n) {
        System.out.println(" 、"+n); // 0
        System.out.println(" 、"+a);//  0
    }
    public static void main(String[] args) {
        System.out.println(" 、main"); //  2、
        Class_LianXi tsc = new Class_LianXi();
    }
}
