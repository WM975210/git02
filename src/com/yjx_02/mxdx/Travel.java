package com.yjx_02.mxdx;

public class Travel {
    public static void main(String[] args) {
        // 国家对象
        Country country =new Country();
        country.name="迪拜";
        country.address="阿联酋迪拜海湾";
        country.hotel="帆船酒店";

        // 秘书对象
        Secretary secretary=new Secretary();
        secretary.name="胡歌";
        secretary.age=25;
        secretary.gender=true;

        // 使用
        secretary.bookTickets(country.name);
        secretary.bookHotel(country);






    }

}
