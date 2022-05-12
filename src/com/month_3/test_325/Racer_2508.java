package com.month_3.test_325;
/*
 * 模拟龟兔赛跑
 * 	兔子每跑十步休息一下 100毫秒
 * 	乌龟正常跑
 *  只要有参赛者跑了100步就结束
 */
public class Racer_2508 implements Runnable{
    // 记录赢的人名字
    private String winner=null; // 控制游戏结束，线程结束

    @Override
    public void run() {
        for (int i=1;i<=100;i++){
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"正在跑第"+i+"步");
            if ("兔子".equals(Thread.currentThread().getName()) && i%10==0){
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
    // 返回值： false比赛结束   true 比赛继续
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
        Racer_2508 ra=new Racer_2508();
        // 两个参赛者
        Thread t1=new Thread(ra,"兔子");
        Thread t2=new Thread(ra,"乌龟");
        // 开启线程
        t1.start();
        t2.start();
    }
}
