// 判断一个数是否是素数
import java.util.Scanner;
public class Test06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("请输入一个数：");

        int n =input.nextInt();
        boolean flag=true;
        if(n==1)
            flag=false;
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    flag=false;
                    break;
               }
            }
        }
        if(flag){
            System.out.println(n+"是素数");
        }else{
            System.out.println(n+"不是素数");
        }



    }
}
