package com.month_3.test_315;

public class Test_1503 {
    public static void main(String[] args) {
        print(new int[]{1,2,3,4,5});
        print(new char[]{'m','n','b'});

        int[]arr=getMaxMin(new int[]{9,8,7,6,5,4});
        System.out.println("最大值="+arr[0]);
        System.out.println("最小值="+arr[1]);

        print (new String[]{"abc","bc","c"});
    }
    //A:遍历int类型的数组 依次输出每个数组元素
    public static void print(int [] arr){
        for(int i:arr){
            System.out.println(i);
        }
    }
    //B:遍历字符数组
    public static void print(char [] arr){
        for(char ch:arr){
            System.out.println(ch);
        }
    }
    //C:最值:获取数组中的最大值和最小值
    public static int [] getMaxMin(int [] arr){
        //记录最大值和最小值
        int max =arr[0];
        int min =arr[0];
        // 遍历数组，每一个数据与max比较
        for(int i:arr){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        // 返回最大与最小
        return new int[]{min,max};
    }
    //D:逆序:倒叙输出数组元素
    public static void print(String[] arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
