package com.month_3.test_325;
/*
    yield 礼让线程    当线程执行到yield方法,会让出cpu的资源,同时线程会恢复就绪状态
 */
public class Yield_2510 implements Runnable{
    public static void main(String[] args) {
        Yield_2510 yi=new Yield_2510();
        new Thread(yi,"小小").start();
        new Thread(yi,"一一").start();
    }

    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+"游戏");
            Thread.yield(); // 礼让
            System.out.println(Thread.currentThread().getName()+"看电影........");
        }
    }
}
