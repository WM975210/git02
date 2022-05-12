package com.month_3.test_310;
// new 关键字
public class Test_1001 {
    public static void main(String[] args) {
        // 创建对象
        Dog d=new Dog("小白" ,"泰迪","白色");
        d.show();
    }

}
class Dog{
    public String name;
    public String type;
    public String color;

    //空构造
    public Dog(){ }

    //带一个参构造
    public Dog(String name){
        this.name=name;
    }
    //带三个参构造
    public Dog(String name,String type,String color){
        this.name=name;
        this.type=type;
        this.color=color;
    }
    // 方法
    public void show(){
        System.out.println(name+","+type+","+color);
    }

}