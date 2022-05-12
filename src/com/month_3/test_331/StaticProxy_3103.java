package com.month_3.test_331;
/*
    静态代理 :
        静态代理
        动态代理

    静态代理:
        代理角色与真实角色实现相同的接口
        代理角色持有真实角色的引用
        代理行为
 */
public class StaticProxy_3103 {
    public static void main(String[] args) {
        // 项目经理
        Manager manager=new Manager();
        // HR
        HR hr=new HR(manager);
        // 代理行为
        hr.addUser();
    }
}

// 录用人
interface AddUser{
    void addUser();
}

// 真实角色 ：项目经理 Manager
class Manager implements AddUser{

    @Override
    public void addUser() {
        System.out.println("面试...录用了");
    }
}
// 代理角色 ： HR
class HR implements AddUser{
    //代理角色持有真实角色的引用
    Manager manager=null;

    public HR(Manager manager) {
        this.manager = manager;
    }

    @Override
    public void addUser() {
        System.out.println("发布招聘");
        System.out.println("筛选简历");
        System.out.println("预约面试");

        // 联系项目经理面试
        manager.addUser();
        System.out.println("谈薪资");
    }
}
