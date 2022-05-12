package com.month_3.test_315;
/*数组逆序操作：定义长度为10的数组，将数组元素对调，并输出对调前后的结果。
        思路：把0索引和arr.length-1的元素交换，把1索引和arr.length-2的元素交换…..
	        只要交换到arr.length/2的时候即可。
*/
public class Test_Homework_1509 {
    public static void main(String[] args) {
        // 定义一个数字，并进行静态初始化
        int [] arr={4,95,16,25,10,97,6,10};
        // 逆序前
        System.out.println("逆序前：");
        printArr(arr);
        // 逆序后
        System.out.println("逆序后：");
        reveseArr(arr);
        printArr(arr);
    }

    private static void reveseArr(int[] arr) {
        for(int x=0;x<arr.length/2;x++){
            int temp=arr[x];
            arr[x]=arr[arr.length-1-x];
            arr[arr.length-1-x]=temp;
        }
    }
    // 遍历数组
    private static void printArr(int[] arr) {
        System.out.println("[");
        for(int x=0;x<arr.length;x++){
            if(x==arr.length-1){ // 这是最后一个元素
                System.out.println(arr[x]+"]");
            }else{
                System.out.println(arr[x]+",");
            }
        }
    }
}
