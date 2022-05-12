package com.month_3.test_314;

import java.util.Objects;

/*  电脑使用外接USB 设备：
       涉及到的几种事物：
            1.电脑
            2.鼠标、键盘...
            3.USB接口
 */
public class Test_1402 {
    public static void main(String[] args) {
        Computer c=new Computer("外星人",30000.0);
        Mouse m = new Mouse();
       c.open();
       m.start();
       m.end();
       c.close();
    }
}
// USB
interface USB{
    void start(); //  开始
    void end();  // 结束
}
// 鼠标
class Mouse implements USB{

    @Override
    public void start() {
        System.out.println("开始使用鼠标");
    }

    @Override
    public void end() {
        System.out.println("结束使用鼠标");
    }
}

// 电脑
class Computer{
    private String brand;
    private double price;
    //  空构造
    public Computer() {
    }
    //  带参构造
    public Computer(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // 重写 toString
    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
    //
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Double.compare(computer.price, price) == 0 &&
                Objects.equals(brand, computer.brand);
    }
    //  开机
    public void open(){
        System.out.println("开机");
    }
    //使用外接USB设备
    public void usbUSB(USB usb){//参数：实现了USB接口的实现类对象都能传递————>USB设备
        // USB usb=new Mouse();  接口多态
        usb.start();
        usb.end();
    }
    // 关机
    public void close(){
        System.out.println("关机");
    }
}