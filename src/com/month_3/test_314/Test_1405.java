package com.month_3.test_314;
//   区分同名变量问题
public class Test_1405 {
    int i=1;
    static int b=5;

    // 成员内部类
    class Inner{
        // 成员变量
        int i=2;

        //  方法
        public void inner(){
            //  局部变
            int i=3;

            // 调用外部类成员变量  i=1
            System.out.println(Test_1405.this.i);
            // 调用内部类的成员变量 i=2
            System.out.println(this.i);
            // 调用局部变量   i=3
            System.out.println(i);
        }
    }
}
