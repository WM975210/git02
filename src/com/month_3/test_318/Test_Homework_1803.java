package com.month_3.test_318;

import java.util.Scanner;

//  A模拟用户登录
public class Test_Homework_1803 {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            // 定义用户名与密码
            String username="Wm";
            String password="666666";
            Scanner scanner=new Scanner(System.in);

            System.out.println("请输入用户名：");
            String name=scanner.nextLine();

            System.out.println("请输入密码：");
            String pwd=scanner.nextLine();

            //  登录判断
            if(name.equals(username) && pwd.equals(password)){
                System.out.println("登录成功过，欢迎您："+username);
                break;
            }else{
                if(2-i==0){
                    System.out.println("您的登录次数已用完");
                }else{
                    System.out.println("登录失败，您今天还有"+(2-i)+"次登录的机会");
                }
            }
        }
    }
}
