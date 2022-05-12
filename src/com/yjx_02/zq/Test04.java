import java.util.Scanner;
public class Test04 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // 输入总分并求和
        double sum=0;
        for (int i=0;i<5;i++){
            System.out.println("请输入第"+(i+1)+"个学生的成绩");

            double d = input.nextDouble();
            sum+=d;
       }
        // 输出总分
        System.out.println("总分是："+sum);
    }
}
