package com.month_3.test_325;
/*
            100张票  共享资源

            三个人重复买完
 */
public class Web12306_2506 implements Runnable{
    int tickets=100;

    @Override
    public void run() {
        while (true){
            if (tickets>=0){
                return;
            }
            System.out.println(Thread.currentThread().getName()+"正在购买第"+tickets--+"张票");
        }
    }

    public static void main(String[] args) {
        // 先构建当前类型的对象
        Web12306_2505 web=new Web12306_2505();

        // 创建线程
        Thread t1=new Thread(web,"一");
        Thread t2=new Thread(web,"九");
        Thread t3=new Thread(web,"四");

        // 开启线程
        t1.start();
        t2.start();
        t3.start();

    }
}
