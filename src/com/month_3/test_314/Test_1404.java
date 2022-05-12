package com.month_3.test_314;
//   测试类
public class Test_1404 {
    public static void main(String[] args) {
        //测试使用成员内部类中的成员
        Test_1403 t=new Test_1403(); // 先创建外部类对象
        Test_1403.Inner y=t.new Inner();
        y.testInner(); // 调用内部类方法里所有内容


        //  测试 Test_1405.java 区分同名问题
        Test_1405.Inner o=new Test_1405().new Inner();
        o.inner();

        // 测试私有内部类  【 无法使用 】  私有的只能在本类中使用

        // 测试静态内部类的使用
        Test_1407.Inner.testStatic(); // 通过类名找到静态内部类，之后找到静态方法
        Test_1407.Inner in8=new Test_1407.Inner();

        in8.test();
        in8.testStatic();



    }
}
