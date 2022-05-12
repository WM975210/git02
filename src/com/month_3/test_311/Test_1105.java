package com.month_3.test_311;

public class Test_1105 {
    public static void main(String[] args) {
        Zi zi = new Zi("");
        zi.test();
    }
}
// 父类
class Fu{
    String str="FuStr";
    // 空构造
    public Fu(){
        System.out.println("父");
    }
    // 带参构造
    public Fu(int i){
        System.out.println("父");
    }
}
// 子类
class Zi extends Fu{
    String str="zistr";
    // 空构造
    public Zi(){
        super(100);
        System.out.println("子");
    }
    // 带参构造
    public Zi(String s){
        this(); //
        System.out.println("zi");
    }
    public void test(){
        String str="local";
        //System.out.println(super.str);  // FuStr
        System.out.println(this.str); // zistr
        System.out.println(str);
    }

}