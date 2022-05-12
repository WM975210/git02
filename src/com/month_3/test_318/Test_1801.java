package com.month_3.test_318;

import java.util.Arrays;

//  枚举类
public class Test_1801 {
    public static void main(String[] args) {
        // 使用枚举类型的实例
        WeekDay day1=WeekDay.DAY1;
        System.out.println(day1.getName());  // 星期一

        // name ()
        System.out.println(day1.name()); // DAY1
        // ordinal() 获取枚举实例在枚举类中字段列表的序号,从开始
        System.out.println(day1.ordinal());  // 0
        //  values()  获取当前枚举类型的所有实例
        WeekDay[] arr=day1.values();
        System.out.println(Arrays.toString(arr)); // [DAY1, DAY2, DAY3, DAY4, DAY5, DAY6, DAY7]

        // switch 语句,在jdk1.5新增支持对枚举类型的数据的判断
        switch(day1){
            case DAY1:
                System.out.println("周一");
                break;
            case DAY2:
                System.out.println("周二");
                break;
            case DAY3:
                System.out.println("周三");
                break;
        }

    }
}

// 定义枚举类:一周中的每一天
enum WeekDay{
    //枚举的字段,默认为当前WeekDay类型的实例
    DAY1("星期一"),DAY2("星期二"),DAY3("星期三"),DAY4("星期四"),
    DAY5("星期五"),DAY6("星期六"),DAY7("星期日");
    // 成员变量
    private String name;
   // 空构造
    WeekDay() {
    }
    //带参构造
    WeekDay(String name) {
        this.name = name;
    }

    // 成员方法
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

}
