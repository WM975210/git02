package com.month_3.test_325;
/*
    void interrupt()  为线程添加一个中断标识
    boolean isInterrupted() 测试此线程是否已被中断,是否曾经调用过interrupt方法添加了中断标识
    static boolean interrupted() 测试当前线程是否已被中断,是否曾经调用过interrupt方法添加了中断标识,同时复位标识

    注意: 当调用sleep方法线程睡眠时 : InterruptedException - 如果有任何线程中断了当前线程。 抛出此异常时，将清除当前线程的中断状态 。
 */
public class Interrupt_2512 implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<=50;i++){
            System.out.println(Thread.currentThread().isInterrupted());
            if (Thread.interrupted()){
                System.out.println("当前线程已被中断..");
                System.out.println(Thread.currentThread().isInterrupted());
                break;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread th=new Thread(new Interrupt_2512());
        System.out.println(th.isInterrupted()); // 只判断是否添加了中断标识，若添加返回true

        //  开启线程
        th.start();

        Thread.sleep(1);

        // 为th线程添加中断标识
        th.interrupt();
    }
}
