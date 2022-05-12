package com.month_3.test_325;
/*
    继承Thread（线程类） 重写run方法（可以定义方法体） start（开启线程）
 */
public class Test_2501_Thread extends Thread{
    /*
        重写run方法 run方法中定义方法体
     */
    @Override
    public void run() {
       for (int i=1;i<=25;i++){
           System.out.println("一边看电视");
           try {
               Thread.sleep(1);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }

    public static void main(String[] args) {
        // 创建一个线程对象
        Test_2501_Thread td=new Test_2501_Thread();
        //  开启线程
        td.start();

        for(int i=1;i<=25;i++){
            System.out.println("一边撸猫");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
