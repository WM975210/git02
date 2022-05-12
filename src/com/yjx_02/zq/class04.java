/*
*     方法
*/

public class class04 {
    public static void main(String[] args) {
        // 1. 调用
        System.out.println (getsum(4.3,3.4));


        //  2.1 调用 计算矩形面积
        System.out.println(getArea(8,9));

        // 2.2
        int j=getArea(8,9);
        System.out.println(j);
 }

    // 1.  求两个小数的和
    public static double getsum(double x,double j){
        return x+j;
    }
    // 2.参数 矩形面积
    public static int getArea(int c,int k){
        return c*k;
    }
}

