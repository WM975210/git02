package com.yjx_02.phone;

public class Class_Kitty {
    public static void main(String[] args) {
            Kitty kitty = new Kitty("皮蛋儿","虎斑","棕色");
            kitty.show();
        }
    }

class Kitty{
    String name;
    String type;
    String color;

    // 构造器
    public Kitty(String kittyName,String kittyType,String kittyColor){
        name = kittyName;
        type = kittyType;
        color = kittyColor;
    }
    public void show(){
        System.out.println(name+","+type+","+color);
    }
}
