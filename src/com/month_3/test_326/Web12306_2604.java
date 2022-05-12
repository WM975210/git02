package com.month_3.test_326;
/*
    同步块 :

        锁资源 :  锁对象,锁不变的内容
                  自定义引用数据类型的对象地址永远不变

 */
public class Web12306_2604 implements Runnable{
    // 共享资源
    Tickets tickets=new Tickets();

    @Override
    public void run() {
        while (true){
            synchronized (tickets){
                if (tickets.num==0){
                    break;
                }
                // 模拟一次购票时间
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在购买第"+tickets.num--+"张票");
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        Web12306_2604 w=new Web12306_2604();
        Thread t1=new Thread(w,"ttt");
        Thread t2=new Thread(w,"ooo");
        Thread t3=new Thread(w,"lll");
        t3.start();
        t2.start();
        t1.start();
    }
}

// 票
class Tickets{
    int num=100;
}