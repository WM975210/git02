package com.month_3.test_331;
/*
    简单工厂模式:
        抽象产品角色 : 具体产品角色实现的接口|继承的父类
        具体产品角色 : 实现类|子类
        工厂角色

    注意:
        字符串比较是否相等需要使用equals方法进行比较字符串的内容,建议常量放在.的前面,避免空指针异常的出现
 */
public class Factory_3104 {
    public static void main(String[] args) {
        // 多态
        Car car=factory("Benz");
        car.run();
    }
    // 工厂角色
    public static Car factory(String name){
        if ("Benz".equals(name)){
            return new Benz();
        }else if("Cadillac".equals(name)){
            return new Cadillac();
        }
        return null;
    }
}
// 抽象产品角色
interface Car{
    void run();
}
// 具体产品角色
class Benz implements Car{
    @Override
    public void run() {
        System.out.println("梅赛德斯.奔驰是理想");
    }
}
// 具体产品角色
class Cadillac implements Car{
    @Override
    public void run() {
        System.out.println("风的呼啸，追随者的叹息");
    }
}
