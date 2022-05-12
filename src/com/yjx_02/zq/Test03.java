import java.util.Scanner;
public class Test03 {
    public static void main(String[] args) {
        //输入月份
        Scanner input=new Scanner(System.in);
        System.out.println("请输入月份");

        int month=input.nextInt();
        //根据月份输出季节
        switch(month){
            case 1:
            case 2:
            case 3:System.out.println("春天-春暖花开  春意盎然-植树 踏青");
            break;
            case 4:
            case 5:
            case 6:System.out.println("夏天-夏日炎炎 夏雨雨人-游泳 吃雪糕");
            break;
            case 7:
            case 8:
            case 9:System.out.println("秋天");
            break;
            case 10:
            case 11:
            case 12:System.out.println("冬天");
            break;
            default:System.out.println("输入有误");

        }

    }
}
