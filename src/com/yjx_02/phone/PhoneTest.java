package com.yjx_02.phone;

public class PhoneTest {
    public static void main(String[] args) {
        // 创建对象
         Phone p=new Phone();

         p.Pin="华为";
         p.Yan="白色";
         p.Chi=6.0;
         p.Jia=3000;

         System.out.println(p.Pin);
         System.out.println(p.Yan);
         System.out.println(p.Chi);
         System.out.println(p.Jia);

         // 调用方法
         p.Phone();

    }
}
