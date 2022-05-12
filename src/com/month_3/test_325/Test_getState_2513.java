package com.month_3.test_325;
/*
    Thread.State getState() 获取线程状态
    Thread.State 线程状态。 线程可以处于以下状态之一：
        NEW : new Thread()
        尚未启动的线程处于此状态。
        RUNNABLE : 就绪|运行
        在Java虚拟机中执行的线程处于此状态。
        BLOCKED : 等待对象锁的阻塞状态
        被阻塞等待监视器锁定的线程处于此状态。
        WAITING : wait(),join()等
        无限期等待另一个线程执行特定操作的线程处于此状态。
        TIMED_WAITING : 与时间相关的等待,sleep(ms),join(ms),wait(ms)...
        正在等待另一个线程执行最多指定等待时间的操作的线程处于此状态。
        TERMINATED : 终止
        已退出的线程处于此状态。
 */
public class Test_getState_2513 implements Runnable{

    @Override
    public void run() {
        for (int i=1;i<=20;i++){
            System.out.println("i="+i);
            if (i==10){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread th=new Thread(new Test_getState_2513());
        System.out.println(th.getState()); //获取当前线程状态  NEW 新生

        th.start();// 开启线程   就绪状态
        System.out.println(th.getState());

        while (true){
            System.out.println("判断循环中："+th.getState());
            // 当th线程终止，循环结束
            if(Thread.State.TERMINATED==th.getState()){
                break;
            }
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
