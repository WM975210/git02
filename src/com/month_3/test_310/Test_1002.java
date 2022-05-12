package com.month_3.test_310;
//成员变量是属于对象的,需要跟随对象使用
// 静态的是属于类的,根据可以随类名使用
public class Test_1002 {
    // 类中方法外
    int i=1;  //  实例变量
    static int j=20;  // 静态变量

    public static void main(String[] args) {
        // 测试调用
        System.out.println(Test_1002.j);//静态的是属于类的,根据可以随类名使用
        // 创建对象
        Test_1002 cd=new Test_1002();
        System.out.println(cd.i);
        System.out.println(cd.j);
    }


    // 成员方法  静态方法
    public void test(){
        System.out.println("类中方法外的成员方法");
    }
    public static void testtatic(){
        System.out.println("被static修饰的静态方法");
    }
}
