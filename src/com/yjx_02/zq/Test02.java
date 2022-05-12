import java.util.Scanner;
public class Test02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //输入分数
        System.out.println("请输入一个分数：");

        double score=input.nextDouble();
        //根据分数，给出等级
        String grade;
        if(score>=90){
            grade="A";
        }else if(score>=80){
            grade="B";
        }else if(score>=70){
            grade="C";
        }else if(score>=60){
            grade="D";
        }else{
            grade="E";
        }
        //输出等级
        System.out.println("score="+score+",grade="+grade);

    }
}
