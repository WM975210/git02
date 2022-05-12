package com.yjx_02.phone;

public class Class_Caker {
    public static void main(String[] args) {
        // 蛋糕师
        Caker caker=new Caker("张小小","女");

        Cake cake=caker.cake("心型","巧克力口味","8寸",300);
        cake.show();
    }
}

// 蛋糕
//  属性  形状：shape   口味：taste 大小:size  价格:price
//  功能：展示细节
class Cake{
    String shape;
    String taste;
    String size;
    double price;
    // 空构造
    public Cake(){}
    //带参构造
    public Cake(String cakeShape,String cakeTaste,String cakeSize,double cakePrice){
        shape=cakeShape;
        taste=cakeTaste;
        size=cakeSize;
        price=cakePrice;

    }
    // 功能   展示细节（打印所有的参数）
    public void show(){
        System.out.println(shape+"——"+taste+"——"+size+"——"+price);
    }
}

/*蛋糕师
*    属性  姓名：name   性别：gender
*/
class Caker{
    String name;
    String gender;
    // 空构造
    public Caker(){}
    // 带参构造
    public Caker(String cakerName,String cakerGender){
        name =cakerName;
        gender=cakerGender;
    }

    // 制作蛋糕
    //返回值：蛋糕：Cake
    //参数：蛋糕的 形状：shape   口味：taste 大小:size  价格:price
    public Cake cake(String shape,String taste,String size,double price){
        //制作蛋糕对象
        Cake cake=new Cake(shape,taste,size,price);
        return cake;
    }

}





