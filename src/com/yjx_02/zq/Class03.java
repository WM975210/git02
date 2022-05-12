public class Class03 {
    public static void main(String[] args) {
        //1.基础调用，有返回值
        //  赋值调用
        gerPI(); // 只是返回值，但是不会输出
        double pi=gerPI(); // 将返回的值 赋值给 pi
        //  输出调用
        System.out.println(gerPI());  // 输出 3.14
        System.out.println(pi);  //  输出 3.14

        // 2.
        System.out.println(getSum(9,10));

        //3.  调用九九乘法表
        print(5);
        print(8);

    }
    // 1. 返回PI的值，没有参数，PI的值 double,方法名：getPI
    public static double gerPI(){
        return 3.14;
    }

    // 2. 计算两个整数的和
       // 参数：int i,int j    返回值 int   方法名  getSum
    public static int getSum(int i,int j){
        return i+j;
    }

    // 3. 输出 m 行的 九九乘法表   参数：int m    不需要返回值
    public static void print(int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+j+i+"\t");
            }
            System.out.println();
        }
    }
}
