package com.month_3.test_314;
// lambda 表达式
public class Test_1408 {
    public static void main(String[] args) {
        // 匿名内部类
      /* Swim s= new Swim(){
            @Override
            public void swimming() {
                System.out.println("一边喝水一边游泳...");
            }
        };
        s.swimming();
        */

        /* 写法 1：（ 参数 ）->{ 方法体 }
        Swim s=()->{
            System.out.println("一边换气一边游泳...");
        };
        s.swimming();
        */

        /*写法2：如果方法体只有一句，{ } 可以省略
        Swim s=()-> System.out.println("一边吃东西一边游泳...");*/

        /* 写法3：如果存在参数列表，参数的类型可以省略
        Swim s=(name)-> System.out.println(name+"一边吃东西一边游泳...");
        s.swimming("周杰伦");
        */

        /*写法4： 如果参数只有一个，前后的（ ） 可以省略
        Swim s=name -> System.out.println(name+"一边喝水一边游泳...");
        s.swimming("张大大");
        */

        // 写法 5：如果lambda体语句只有一句，并且为return语句,前后的{}与return关键字可以一起省略
        Swim2 m=age -> age>18;
        System.out.println(m.swimming2(19));

    }
}
// 接口
interface Swim{
    void swimming(String name);
}
// 写法5 的接口
interface Swim2{
    boolean swimming2(int age);
}