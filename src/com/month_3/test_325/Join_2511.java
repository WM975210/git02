package com.month_3.test_325;

/*
    join（） 插队线程
        delivery man 外卖小哥

 */
public class Join_2511 {
    public static void main(String[] args) {
        new Thread(new Buyers()).start();
    }
}
class Buyers implements  Runnable{

    @Override
    public void run() {
        System.out.println("饿了，想吃零食");
        System.out.println("点了个外卖...");
        // 开启外卖小哥线程
        Thread th=new Thread(new DeliveryMan());
        // 就绪
        th.start();
        try {
            th.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("谢了小哥，接过外卖..");
    }
}

class DeliveryMan implements Runnable{

    @Override
    public void run() {
        System.out.println("小哥从商家取过餐。。");
        System.out.println("配送路上看到有人吵架...看了10s钟...");

        for (int i=1;i<=10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+"s过去了...");
        }
        System.out.println("赶紧继续送餐..");
        System.out.println("把外卖给了我...");
    }

}
