// 输入一个数，判断是奇数还是偶数
import java.util.Scanner;
public class Test01{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // 输入一个数
        System.out.println("请输入你要判断的数据：");
        int i=input.nextInt();
        //判断一个数据是奇数还是偶数
        if(i%2==0){
            System.out.println(i+" 这个数据是偶数");
        }else{
            System.out.println(i+" 这个数据是奇数");
        }

    }

}