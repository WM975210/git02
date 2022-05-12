package com.month_3.test_315;

import java.util.Arrays;

public class Test_1504 {
    public static void main(String[] args) {
        int[] arr={1,26,0,8,10,50,8,0,7,35,0,4,3,20,0,17};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(checkZero(arr)));

        System.out.println(findValue(arr,0));

        System.out.println(change(new char[]{'!','Z','A','M'}));
    }



    /*
     * E:将一个整型数组中的0去掉后但会一个新数组.
     * 	例如: int[] arr={1,26,0,8,10,50,8,0,7,35,0,4,3,20,0,17};
     *  要求:将以上数组中的0去掉,将不为0的值存入一个新数组,生成新的数组作为返回值.
     *  	int newArr={1,26,8,10,50,8,7,35,4,3,20,17};
     */
    public static int[]checkZero(int []arr){
        // 统计不为零的数据个数
        int count=0;
        for(int i:arr){
            if(i!=0){
                count++;
            }
        }
        //判断原数组是否存在0
        if(count==arr.length){
            //不存在是直接返回原数组
            return arr;
        }
        //存在0，根据长度创建新数组
        int[]newArr=new int[count];
        //原数组数据拷贝到新数组
        int j=0;  // 新数组索引
        for(int i:arr){// 遍历原数组
            if(i!=0){
                newArr[j++]=i;
            }
        }
        //  新数组返回
        return newArr;
    }
    /*F:数组元素查找(查找指定元素第一次在数组中出现的索引)
     * 若存在:返回这个元素的下标
     * 若不存在:返回-1
     */
    public static int findValue(int[]arr,int value){
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==value){
                return i;
            }
        }
        return -1;
    }
    /*
	 G:将一个存放了大写字母的数组转换成存放小写字母的数组返回
	 */
    public static char[] change(char[] arr){
        if(arr!=null && arr.length!=0){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>='A'&& arr[i]<='Z'){
                    //  arr[i]=(char)(arr[i]+32);
                    arr[i]+=32;
                }
            }
        }
        return arr;
    }
}
