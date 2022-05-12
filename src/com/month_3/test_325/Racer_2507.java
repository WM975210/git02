package com.month_3.test_325;
/*
 * 模拟龟兔赛跑
 * 	兔子每跑十步休息一下 100毫秒
 * 	乌龟正常跑
 *  只要有参赛者跑了100步就结束
 */
public class Racer_2507 implements Runnable{
    private String winner=null;

    @Override
    public void run() {
        for (int i=1;i<=100;i++){
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"正在跑第"+i+"步");
            if ("兔子".equals(Thread.currentThread().getName())&& i%10==0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 判断是否还要继续
            if (!checkOver(i)){
                break;
            }
        }
    }
    // 判断是否进行下一步
    // 返回值  false 比赛结束   true 比赛继续
    public boolean checkOver(int step){ // 步数
        if (winner!=null){
            return false;
        }
        if (step==100){
            winner=Thread.currentThread().getName();
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // 一场比赛
        Racer_2507 cer=new Racer_2507();
        // 两个参赛者
        Thread t1=new Thread(cer,"乌龟");
        Thread t2=new Thread(cer,"兔子");
        // 开启线程
        t1.start();
        t2.start();
    }
}
