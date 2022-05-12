package com.month_3.test_326;
/*
    同步方法控制案例的数据安全
        在方法上通过synchronized关键字修饰方法
            成员方法
                锁的是调用成员方法的对象
            静态方法
                锁的是类的Class对象

        优点: 简单,直接同步整个方法体
        缺点: 代码范围太大,效率较低
 */
public class Web12306_2602 implements Runnable{
    // 共享资源100张票
    int tickets=100;

    @Override
    public void run() {
        while (true){
            if (!buyTicket()){
                break;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 一次购票过程，每个线程排队购买
    // 返回值：true 继续购买    false 结束购买
    // 封装一个方法
    public synchronized boolean buyTicket(){
        if (tickets==0){
            return false;
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"正在购买第"+tickets--+"张票");
        return true;
    }

    public static void main(String[] args) {

        Web12306_2602 w=new Web12306_2602();
        // 创建线程
        Thread t1=new Thread(w,"张大大");
        Thread t2=new Thread(w,"一一一");
        Thread t3=new Thread(w,"星-------河");
        Thread t4=new Thread(w,"灭霸");
        // 开启线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
