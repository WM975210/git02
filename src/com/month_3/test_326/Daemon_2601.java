package com.month_3.test_326;
/*
    线程的分类:
       用户线程 : 默认线程为用户线程
       守护线程

    守护线程 : 守护用户线程的
        当所有的用户线程全都执行完毕,守护线程直接结束
        垃圾回收机制典型守护线程
        void setDaemon(boolean on) 将此线程标记为 daemon线程或用户线程。
                         true  为守护线程
                         false  为用户线程
 */
public class Daemon_2601 implements  Runnable{

    @Override
    public void run() {
        String st="上海，加油！！！";
        while (true){
            System.out.println("守护线程................"+st);
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(new Daemon_2601());
        // 设置守护线程
        t.setDaemon(true);
        // 开启线程
        t.start();
        Thread.sleep(30);

        System.out.println("主线程-------> 用户线程结束");

    }
}
