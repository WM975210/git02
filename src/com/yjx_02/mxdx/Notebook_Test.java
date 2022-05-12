package com.yjx_02.mxdx;

public class Notebook_Test {
    public static void main(String[] args) {
       /* String brand; // 品牌
        String color;  // 颜色
        double size;  //  尺寸
        int price;  //  价格       code  写代码*/
        // 创建对象
        Notebook n = new Notebook();

        n.brand="联想";
        n.color="银灰色";
        n.size=15.6;
        n.price=4995;
        System.out.println(n.brand); //null
        System.out.println(n.color); //null
        System.out.println(n.size);  //null
        System.out.println(n.price); // 0
        //System.out.println("一台"+n.color+"的"+n.brand+"笔记本电脑，"+n.size+"寸价格是："+n.price);

        n.code();
    }
}
