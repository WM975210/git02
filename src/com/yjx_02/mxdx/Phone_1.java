package com.yjx_02.mxdx;

public class Phone_1 {
    public static void main(String[] args) {
        /*String brand; // 品牌
         String color;  // 颜色
          Double size;  //  尺寸
        */
        // 创建对象
        Phone p = new Phone();

        //属性赋值  使用对象
        p.brand="VIVO";
        p.color="银色";
        p.size=6.0;

        System.out.println(p.brand);
        System.out.println(p.color);
        System.out.println(p.size);

        p.call();
        p.texting();


    }
}
