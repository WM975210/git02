package com.month_3.test_326;
/*
    线程通信
    生产者消费者模式 : 生产者用来生产商品,消费者就是消费产品
    Object类中wait()等待,notify()唤醒,notifyAll()唤醒全部

    wait() 等待,通过对象调用wait()方法让当前进入等待阻塞状态,会进入到调用wait方法对象的等待池中进行等待,等待被唤醒
           让出cpu的资源,同时释放对象的锁
    notify() 唤醒 : 唤醒对象等待池中正在等待的线程,被唤醒的线程进入到就绪队列,需要被cpu调度同时获取对象锁才能执行

    wait()与notify()必须使用在同步环境下,用来协调多线程对共享数据存储的问题,否则会抛出异常 IllegalMonitorStateException - 如果当前线程不是此对象监视器的所有者。

    人车公用街道 :
        街道   信号灯boolean: true绿灯  false红灯  ns南北  we东西

        人 : 走绿灯true  人走南北ns
        车 : 走红灯false 车走东西走向 we

    练习 : 使用多线程实现,输出AB1CD2....YZ13
 */
public class Street_2605 {
    public static void main(String[] args) {
        // 共享街道
        Street street=new Street();
        new Thread(new Person(street)).start();
        new Thread(new Car(street)).start();
    }
}
//  街道
class Street{
    // 信号灯
    private boolean flag=false;

    public Street() {
    }

    public Street(boolean flag) {
        this.flag = flag;
    }
    // na--人
    public synchronized void ns(){
        if (flag){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("人走");
            // 信号灯变灯
            flag=false;
            // 唤醒车线程
            this.notify();
            // 自己等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    // we --车
    public synchronized void we(){
        if (!flag){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("车走");
            // 信号灯变灯
            flag=true;
            // 唤醒人线程
            this.notify();
            // 自己等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
// 人线程
class Person implements Runnable{
    private Street street=null;
    public Person(Street street){
        this.street=street;
    }
    @Override
    public void run() {
        while (true){
            street.ns();
        }
    }
}
// 车线程
class Car implements Runnable{
    private Street street=null;

    public Car(Street street){
        this.street=street;
    }
    @Override
    public void run() {
        while (true){
            street.we();
        }
    }
}


