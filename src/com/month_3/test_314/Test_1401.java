package com.month_3.test_314;

public class Test_1401 {
    public static void main(String[] args) {
        //System.out.println(MP.PI);
        // 实现类对象
        Brand b=new Brand();
        b.show1();
        b.p1();
    }
}

//  定义一个手机的接口  brand  品牌
interface MP{
    // 公共的静态的常量
    double PI=3.14;
    // 公共的抽象方法
    void show1();
    void show2();
}
// 价格
interface Price{
    void p1();
    void p2();
}

// 具体实现类
class Brand implements MP,Price{

    @Override
    public void show1() {
        System.out.println("国产华为");
    }

    @Override
    public void show2() {
        System.out.println("新发布苹果");
    }

    @Override
    public void p1() {
        System.out.println("华为：8000起");
    }

    @Override
    public void p2() {
        System.out.println("苹果：6500起");
    }
}


