package com.month_3.test_325;
/*
   实现 Runnable接口  重写run方法  start开启线程
 */
public class Test_2503_Runnable implements Runnable{
    public static void main(String[] args) {
        Thread th=new Thread(new Test_2503_Runnable());
        th.start();
        for (int i=1;i<=20;i++){
            System.out.println("喝饮料...");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        for (int i=1;i<=20;i++){
            System.out.println("看电影");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
