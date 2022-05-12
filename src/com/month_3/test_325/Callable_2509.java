package com.month_3.test_325;

import java.util.concurrent.*;

/*
 *  开启线程第三种方式 : (了解)
 *      实现juc包下的Callable接口,重写call方法 + 线程池
 *      优点:
 *          call方法可以抛出异常,可以定义返回值,run方法不可以
 */
public class Callable_2509 implements Callable <Integer>{
    // 记录赢的人名字
    private String winner=null; // 控制游戏结束 ，线程结束


    @Override
    public Integer call() {
        for (int i=1;i<=100;i++){
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"正在跑第"+i+"步");
            if ("兔子".equals(Thread.currentThread().getName()) &&  i % 10==0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (!checkOver(i)){
                return i;
            }
        }
        return null;
        // 判断是否进行下一步
        // 返回值：false 结束比赛   true 继续比赛

    }
    public boolean checkOver(int step){
        if (winner!=null){
            return false;
        }
        if (step==100){
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 一场比赛
        Callable_2509 c=new Callable_2509();
        // 两个参赛者

        // 1.创建一个固定大小2个线程的线程池  得到一个线程池提供的执行服务
        ExecutorService service=Executors.newFixedThreadPool(2);

        //2)提交任务  submit(Callable<T> task)
        Future<Integer> re1=service.submit(c);
        Future<Integer> re2=service.submit(c);

        //3)得到结果 V get()
        Integer n1=re1.get();
        Integer n2=re2.get();
        System.out.println(n1);
        System.out.println(n1);

        //4)关闭服务
        service.shutdown();

    }

}
