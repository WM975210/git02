package com.month_3.test_331;
/*
    懒汉式
        线程不安全的|不同步的
        控制线程安全: 方法在添加synchronized关键字进行修改
        synchronized : 被修改的内容多个线程之间排队执行
        1.构造器私有化
        2.私有的静态的该类的引用
        3.公共的静态的访问方式
 */
public class SingleTon_3102 {
    private static SingleTon_3102 ton=null;

    public SingleTon_3102() {
    }

    //公共的静态的访问方式
    // synchronized : 被修改的内容多个线程之间排队执行
    public static synchronized SingleTon_3102 neInstance(){
        if (ton==null){
            ton=new SingleTon_3102();
        }
        return ton;
    }
}

