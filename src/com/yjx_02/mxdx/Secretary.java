package com.yjx_02.mxdx;
// 秘书类

public class Secretary {
    String name;  // 名子
    boolean gender; //  false 女  true 男
    int age; // 年龄

    // 预定机票  bookTickets
    // 没有返回值
    // 参数： 国家名字  String countryName
    public void bookTickets(String countryName){
        System.out.println(name+"正在为您预定去"+countryName+"的机票");
    }
    // 预定酒店 bookHotel
    public void bookHotel(Country country){
        System.out.println(name+"正在为您预定"+country.name+"的"+country.hotel);
    }
}
