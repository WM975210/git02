public class Iftest01 {
    public static void main(String[] args) {
        //if 双分支结构
        int num=(int)(Math.random()*24);
        System.out.println(num);

        if((num&1)==1){
            System.out.println("奇数");
        }else{
            System.out.println("偶数");
        }

        System.out.println("执行结束！");

        int a=10;
        System.out.println("a--   = " +  (a--) );




    }
}
