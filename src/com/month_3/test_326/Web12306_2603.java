package com.month_3.test_326;
/*
    同步块 :
        synchronized(条件){
            排队执行的代码;
        }

        条件 : 类名.class | this | 资源

        锁类: 锁类相当于锁住了这个类的所有对象,如果只想要锁当前类的某一个对象,建议锁那一个具体的对象this

 */
public class Web12306_2603 implements Runnable{
    // 共享资源 100张票
    int tickets=100;

    @Override
    public void run() {
        while (true){
    /*
            // 同步锁  锁类
            synchronized (Web12306_2603.class){
                if (tickets==0){
                    break;
                }
                // 模拟一次购票的时间
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在购买第"+tickets--+"张票");
            }
     */
            //  同步块--- >  锁this 成员方法中this默认指代当前调用成员方法的对象
            synchronized (this){
                if (tickets==0){
                    break;
                }
                // 模拟一次买票的时间
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                System.out.println(Thread.currentThread().getName()+"正在购买第"+tickets--+"张票");
            }
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 方法cpu切换调度的概率
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Web12306_2603 w=new Web12306_2603();
        // 创建线程
        Thread t1=new Thread(w,"AAA");
        Thread t2=new Thread(w,"BBB");
        Thread t3=new Thread(w,"CCC");
        // 开启线程
        t1.start();
        t2.start();
        t3.start();

    }
}
