package com.month_3.test_323;

import java.util.*;

/*
    编号 名称 单价 出版社
    使用List和Map存放多个图书信息，遍历并输出。
    其中商品属性：编号，名称，单价，出版社;使用商品编号作为Map中的key。
 */
public class Map_2303 {
    public static void main(String[] args) {
        // 创建books对象
        Books b1=new Books(1001,"JAVA",188.0,"Sun出版社");
        Books b2=new Books(1002,"Python",288.0,"Python出版社");
        Books b3=new Books(1003,"C++",155.0,"C++出版社");

        List<Books> list =new ArrayList<>();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        for (Books b:list){
            System.out.println(b);
        }

        HashMap<Integer,Books> map=new HashMap<>();
        map.put(b1.getNum(),b1);
        map.put(b2.getNum(),b2);
        map.put(b3.getNum(),b3);
        






    }
}
/*
    num 编号
    name 名字
    price 价格
    press 出版社
 */
class Books{
    private int num;
    private String name;
    private double price;
    private String press;

    public Books() {
        super();
    }

    public Books(int num, String name, double price, String press) {
        super();
        this.num = num;
        this.name = name;
        this.price = price;
        this.press = press;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    @Override
    public String toString() {
        return "Books{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", press='" + press + '\'' +
                '}';
    }


}