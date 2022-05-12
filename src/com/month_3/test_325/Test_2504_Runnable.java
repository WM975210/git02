package com.month_3.test_325;

/*
    实现Runnable 接口
 */
public class Test_2504_Runnable implements Runnable{
    public static void main(String[] args) {
        Thread th=new Thread(new Test_2504_Runnable());

        th.start();

        for (int i=1;i<=50;i++){
            System.out.println("一边洗漱");

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void run() {
        for (int i=1;i<=50;i++){
            System.out.println("一边听歌...");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {


            }
        }
    }
}
