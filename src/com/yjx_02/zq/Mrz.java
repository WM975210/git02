package com.yjx_02.zq;

public class Mrz {
    public String s;
    public char c;
    public byte b;
    public short h;
    public int i;
    public long l;
    public double d;
    public boolean g;

    public static void main(String[] args) {
        Mrz m=new Mrz();
        System.out.println(m.s);  // null
        System.out.println(m.c);  // 空字符
        System.out.println(m.b);  // 0
        System.out.println(m.h);  // 0
        System.out.println(m.i);  // 0
        System.out.println(m.l);  // 0
        System.out.println(m.d);  // 0.0
        System.out.println(m.g);  // false

   }
}
