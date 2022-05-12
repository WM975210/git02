package com.month_3.test_311;
//   继承
public class Tese_1102 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "皮蛋儿";
        cat.food="罐头";
        cat.show();
        cat.tast("罐头","小白");

    }
}
    // 父类 animal
    class Animal{
        public String name;
        public String kind; //品种


        public void show(){
            System.out.println(name+"在睡懒觉");
        }

    }

    // 子类  sound 声音   food 食物
    class Cat extends Animal{
        public String food; // 食物

        //构造器
        public Cat(){ }

        public void tast(String food,String name){
            System.out.println(name+"在撒娇");
        }
    }

    //  子类
    class Dog1 extends Animal{
        public String food;  // 食物

        //构造器
        public Dog1(){ }

        public void sound(){
            System.out.println("小狗汪汪汪");
        }
    }

