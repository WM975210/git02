package com.yjx_02.phone;

public class Class_Static {
    //类中方法外  成员变量
    int i=1; // 实际变量 没有被修饰
    static int j=100; // 静态变量

    public static void main(String[] args) {
        System.out.println(Class_Static.j);  // 100  调用 类名.变量名

        Class_Static cs =new Class_Static();
        System.out.println(cs.i);

    }
    public void test(){
        System.out.println("成员方法");
    }
    public static void testStatic(){
        System.out.println("被static修饰的静态方法");
    }
}
