package com.month_3.test_325;
/*
    100张票 --> 共享资源
    3个人重复买完
 */
public class Web12306_2505 implements Runnable{
    int tickets=100;
    /*
           线程体： 购票
     */
    @Override
    public void run() {
        while (true){
            if (tickets<=0){
                return;
            }
            System.out.println(Thread.currentThread().getName()+"正在抢购第"+tickets--+"张票");
        }
    }
    public static void main(String[] args) {
        Web12306_2505 wed=new Web12306_2505();

        // 创建线程
        Thread t1=new Thread(wed,"小小");
        Thread t2=new Thread(wed,"周周");
        Thread t3=new Thread(wed,"王一");
        //  开启线程
        t1.start();
        t2.start();
        t3.start();


    }
}
