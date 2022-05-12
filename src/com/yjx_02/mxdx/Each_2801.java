package com.yjx_02.mxdx;
/*
    数组的联系

 */
public class Each_2801 {
    public static void main(String[] args) {
        int[] it=new int[]{1,2,3,4,5,6};

        charr(new char[]{'a','b','c'});

        System.out.println("------------普通for-----------");
        // 遍历
        for(int i=0;i<=it.length-1;i++){
            System.out.println(it[i]);
        }

        System.out.println("-----------增强for------------");
        for (int i:it){
            System.out.println(i);
        }
    }

    public static void charr(char[] ch){
        for (char c:ch){
            System.out.println(c);
        }
    }
}
