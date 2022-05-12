package com.month_3.test_317;

import java.util.Arrays;

public class Test_1701 {
    public static void main(String[] args) {
        int[] arr=new int[]{9,8,7,3,2,1};
        int[] arr1=new int[]{9,8,7,3,2,1};

        // 1 ---  toString  equals   deepToString   deepEquals
        // System.out.println(arr); 输出的是数组地址
        System.out.println(Arrays.toString(arr));  //原样输出数组中的内容
        System.out.println(Arrays.equals(arr,arr1));//比较两个数组中的内容是否一样,适用一维数组

        int[] [] arr2={{97,10,25},{03,1,22},{95,4,16}};
        int[] [] arr3={{97,10,25},{03,1,22},{95,4,16}};
       // System.out.println(Arrays.toString(arr2));   对于二维数组 输出的是地址
        System.out.println(Arrays.deepToString(arr2)); // 原样输出二维数组的内容
        System.out.println(Arrays.deepEquals(arr2,arr3));  //比较数组中队的内容是否一样 一样返回true



        // 2----- Arrays.copyOf
        int[] arr4=new int[]{1,2,3,4,5,6};
        //int[] arr5=new int[10];
        // 如果新数组长度和原数组长度一样,原样拷贝 原数组的内容 [1, 2, 3, 4, 5, 6]
        System.out.println(Arrays.toString(Arrays.copyOf(arr4,6)));

        // 新数组长度小于原数组,拷贝到新数组指定的长度  [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(Arrays.copyOf(arr4,5)));

        // 新数组长度大于原数组,后面空白用数据类型的默认值代替   [1, 2, 3, 4, 5, 6, 0, 0, 0, 0]
        System.out.println(Arrays.toString(Arrays.copyOf(arr4,10)));

        // 3------  Arrays.copyOfRange  (原数组名,截取的索引开始,结束) 结束的索引位置不包含  [2, 3, 4]
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr4,1,4)));


        // 4 ----- arraycopy
        // int[] arr4=new int[]{1,2,3,4,5,6};
        int [] arr5=new int[10];
        System.out.println(Arrays.toString(arr5));// [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        // (原数组名,要拷贝的原数组索引,新数组名,新数组索引开始,要拷贝的长度)
        System.arraycopy(arr4,1,arr5,2,3);
        System.out.println(Arrays.toString(arr5));  // [0, 0, 2, 3, 4, 0, 0, 0, 0, 0]


        // 5 -------  Arrays.fill(数组名,索引开始位置,结束位置,要填充的数值);
        int[] ar= {1,2,3,4,5,6};
        Arrays.fill(ar,1);  // 将5个数值都填充的1
        System.out.println(Arrays.toString(ar));

        Arrays.fill(ar,1,4,80);  // [1, 80, 80, 80, 1, 1]
        System.out.println(Arrays.toString(ar));

        int[] ar1= {6,5,9,2,1,6};
        // 6-------  Arrays.sort(数组名);   升序排序
        Arrays.sort(ar1);
        System.out.println(Arrays.toString(ar1));

        //  Arrays.sort(数组名,索引开始,索引结束);  只为索引指定范围排序
        int[] ar2= {6,5,9,2,1,6};
        Arrays.sort(ar2,1,5); // [6, 1, 2, 5, 9, 6]
        System.out.println(Arrays.toString(ar2));

        //  7 ------ Arrays.binarySearch(数组名,数组中值) --用二进制搜索指定值得索引
        // 搜素的前提是要将数组中的内容 排序好
        int[] ar3= {6,5,9,2,1,6};
        Arrays.sort(ar3);
        System.out.println(Arrays.toString(ar3));  // [1, 2, 5, 6, 6, 9]
        System.out.println(Arrays.binarySearch(ar3,2)); // 索引 为1



    }
}
