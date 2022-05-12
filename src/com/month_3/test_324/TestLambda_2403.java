package com.month_3.test_324;
/*
 * 习题三:
 * 	1)声明一个带两个泛型的函数式接口,发型类型为<T,R> T为参数,R为返回值
 * 	2)接口中声明对应抽象方法
 *  3)在TestLambda类中声明方法,参数三个,两个long类型的参数,接口作为参数,接口实现中计算两个long型参数的和
 *  4)再计算两个long型参数的乘积
 */
public class TestLambda_2403 {
    public static void main(String[] args) {
        System.out.println(testLong(10l,20l,(x,y)->x+y));
        System.out.println(testLong(15l,13l,(x,y)->x*y));
    }
    //能够对两个long类型的数据进行某种操作,返回结果
    public static Long testLong(Long l1,Long l2,MyFunction2<Long,Long>my){
        return my.test(l1,l2);
    }
}
interface MyFunction2<T,R>{
    R test(T t1,T t2);
}