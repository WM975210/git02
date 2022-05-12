package com.month_3.test_331;
/*
    单例模式:
        在有些系统中，为了节省内存资源、保证数据内容的一致性，对某些类要求只能创建一个实例，这就是所谓的单例模式。
    懒汉式 : 在调用功能时才创建对象   ->线程不安全|不同步的
    饿汉式 : 在类加载完成之后就创建对象->线程安全的|同步的
    步骤:
        1.构造器私有化
        2.私有的静态的该类的引用
        3.公共的静态的访问方式
    饿汉式:
 */
public class Single_3101{
    private static Single_3101 single=new Single_3101();

    private Single_3101() {
    }

    public static Single_3101 newInstance(){
        return single;
    }
}