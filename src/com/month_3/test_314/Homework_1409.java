package com.month_3.test_314;

public class Homework_1409 {
    public static void main(String[] args) {
        C3 cylinder=new Cylinder(5,2,"天蓝色");
        System.out.println(cylinder);
    }
}
// （1）定义接口A，里面包含c值为3.14的常量PI和抽象方法double area()。
interface A1{
    double PI=3.14;
    double area();
}
// (2)定义接口B，里面包含抽象方法void setColor(String c)。
interface B2{
    void setColor (String c);
}
// （3）定义接口C，该接口继承了接口A和B，里面包含抽象方法void volume()。
interface C3 extends A1,B2{
    void volume();
}
// （4）定义圆柱体类Cylinder实现接口C，该类中包含三个成员变量：底圆半径radius、
//圆柱体的高height、颜色color。
class Cylinder implements C3 {
    private double radius;
    private double heigt;
    private String color;
    // 空构造
    public Cylinder() {
    }
    //带参构造
    public Cylinder(double radius, double heigt, String color) {
        this.radius = radius;
        this.heigt = heigt;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeigt() {
        return heigt;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeigt(double heigt) {
        this.heigt = heigt;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", heigt=" + heigt +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public void volume() {

    }
}