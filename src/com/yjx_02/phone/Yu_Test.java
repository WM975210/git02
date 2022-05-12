package com.yjx_02.phone;
/*String name;
    int Shu;
    String Yan;*/
public class Yu_Test {
    public static void main(String[] args) {
        Yu y = new Yu();

        y.name = "海豚";
        y.Shu="一群";
        y.Yan="蓝色";
        System.out.println(y.name);
        System.out.println(y.Shu);
        System.out.println(y.Yan);
        y.Yu();

        Yu m=new Yu();
        m.name = "鲨鱼";
        m.Shu="两只";
        m.Yan="黑色";
        System.out.println(m.name);
        System.out.println(m.Shu);
        System.out.println(m.Yan);
        m.Yu(m);

    }
}
