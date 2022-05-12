// 找出【100-300】之间能被5整除的所有数，每行输出8个数，使用 ， 分隔每两个数据
public class Class2_ForPractice {
    public static void main(String[] args) {
        int count=0;  //声明一个 计数器
        for(int i=100;i<300;i++){
            if(i%5==0){
                //每行的第一个数据，只打印数据，不打印 ，
                if(count==0){
                    System.out.print(i);
                }else{
                    System.out.print(","+i);
                }
                count++;
                if(count==8){
                    System.out.println(); //换行
                    count=0;  // 计数器归零
                }

            }
        }
        int a=0;
        int c=0;
        do{
            --c;
            a=a-1;
        }while(a>0);
        System.out.println(a+"  "+c);

    }






    }




