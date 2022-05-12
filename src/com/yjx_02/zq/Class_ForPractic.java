
//for循环练习

public class Class_ForPractic {
    public static void main(String[] args){
        //求1-100的和，求1-100的偶数和，求1-100的奇数和
        int sum=0;  //1-100的和
        int sum1=0; // 奇数和
        int sum2=0;  // 偶数和
        for(int i=1;i<=100;i++){
            sum+=i; //循环体
            //奇数
            if(i%2!=0){
                sum1+=i;
            }else{
                sum2+=i;
            }
        }
        System.out.println("1-100的总数和为："+sum);
        System.out.println("1-100的偶数和为："+sum1);
        System.out.println("1-100的奇数和为："+sum2);

        // 求偶数和的另外一种方法
        sum1=0;
        for(int i=0;i<=100;i+=2){
            sum1+=i;
        }
        System.out.println("偶数和为："+sum1);

    }
}
