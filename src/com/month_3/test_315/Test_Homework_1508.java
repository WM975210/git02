package com.month_3.test_315;
/*获取数组最大值和最小值操作：利用Java的Math类的random()方法，编写函数得到0到n之间的随机数，n是参数。
                         并找出产生50个这样的随机数中最大的、最小的数，并统计其中>=60的有多少个。
*/
public class Test_Homework_1508 {
    public static void main(String[] args) {
        // 创建一个长度为50，每个元素在0-100之间的数组
        int[][] getArray = new int[0][];
        int[] arr=getArray[100];
        // 遍历数组
        printArr(arr);
        // 获取最大值和最小值
        int min=getMin(arr);
        int max=getMax(arr);
        System.out.println("数组中最大值："+max+"\t数组中最小值："+min);
        // 统计其中大于等于60的元素个数
        int count=count(arr,60);
        System.out.println("数组中大于或等于60的数有："+count+"个");
    }



    // 遍历数组
    private static void printArr(int[] arr) {
        System.out.println("输出数组元素");
        for(int i=0;i<arr.length;i++){
            if(i%10==0){
                System.out.println();
            }
            System.out.println(arr[i]+"\t");
        }
    }
    // 获取数组最大值
    private static int getMax(int[] arr) {
        int max=arr[0];
        for(int i=1;i<=arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    // 获取数组最小的值
    private static int getMin(int[] arr) {
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    // 创建数组  并且初始化50个数据
    public static int[]getArray(int n){
        int arr[]=new int[50];
        for(int i=0;i<50;i++){
            arr[i]=(int)(n*Math.random());
        }
        return arr;
    }
    //统计数组中大于等于60的数量的方法
    private static int count(int[] arr, int elem) {
        int cont=0;
        for(int i:arr){
            if(i>=elem){
                int count=0;
                count++;
            }
        }
        int count = 0;
        return count;
    }
}
