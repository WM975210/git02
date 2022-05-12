package com.month_3.test_325;
/*
    多线程
 */
public class Test_2502_Thread extends Thread {
    /*
        重写run方法
     */
    @Override
    public void run() {
       for (int i=1;i<=20;i++){
           System.out.println("一边吃零食");
           try {
               Thread.sleep(1);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }

    public static void main(String[] args) {
        // 创建一个对象
        Test_2502_Thread t=new Test_2502_Thread();
        // 开启线程
        t.start();
        for (int i=1;i<=20;i++){
            System.out.println("一边看电视...");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
