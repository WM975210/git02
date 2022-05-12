package com.month_3.test_325;
/*
        线程的优先级 :
        方法线程优先执行的可能性
        1~10 设置值
        1最小 ->static int MIN_PRIORITY 线程可以拥有的最低优先级。
        10最大->static int MAX_PRIORITY 线程可以拥有的最大优先级。
        5默认值 ->static int NORM_PRIORITY 分配给线程的默认优先级。

        int getPriority() 返回此线程的优先级。
        void setPriority(int newPriority) 更改此线程的优先级。
 */
public class GetState_2514 implements Runnable{
    public static void main(String[] args) {
        GetState_2514 ge=new GetState_2514();
        Thread t1=new Thread(ge,"A");
        Thread t2=new Thread(ge,"B");
        Thread t3=new Thread(ge,"C");

        t1.setPriority(Thread.MIN_PRIORITY);  // 最小  1 优先级最低
        t2.setPriority(10); // 最大  优先级最高
        t3.setPriority(Thread.NORM_PRIORITY); // 默认

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        t1.start();
        t2.start();
        t3.start();
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"执行了");
    }
}
