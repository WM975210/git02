package com.month_3.test_321;
//  简单封装容器类型(ArrayList)

import java.util.Arrays;

public class Test_2102 {
    public static void main(String[] args) {
        MyContainer my=new MyContainer();
        my.add("ABC");
        System.out.println(my); //  MyContainer{elementData=[ABC], size=1}
        System.out.println(my.size());
        my.add("上海");
        System.out.println(my); // MyContainer{elementData=[ABC, 上海], size=2}
        my.add("1025");
        System.out.println(my); //MyContainer{elementData=[ABC, 上海, 1025], size=3}

        System.out.println(my.get(0)); // 索引 0的位置  ABC
        System.out.println(my.get(2)); // 索引2的位置  1025

        System.out.println(my.remove(1)); // 删除索引为1的位置 上海
        System.out.println(my); // MyContainer{elementData=[ABC, 1025, null, null], size=2}
        System.out.println(my.size());  // 2
    }
}
class MyContainer{
    private String[] elementData; // 内部存储字符串数据的数组
    private int size; //  容器中存储数据的个数

/*
       添加数据
       @param value  要添加对的数据
 */
    public void add(String value) {
        // 判断是否为第一次添加数据
        if(elementData==null||elementData.length==0){ //   第一次添加
            elementData=new String[1];
            elementData[0]=value;
            size++;
            return;
        }
        // 不是第一次添加，证明存在原数组，并且原数组中存在数据
        // 记录原数组的地址
        String[] temp=elementData;
        // 1.创建新数组，新数组长度+1 | size+1
        elementData=new String[size+1];
        // 2. 原数组中数据拷贝到新数组中
        for(int i=0;i<size;i++){
            elementData[i]=temp[i];
        }
        // 3. 新数组放入到新数组的最后
        elementData[size]=value;
        // 4.size++
        size++;
    }
    // 获取 根据索引获取
    public String get(int index){
        // 判断是否为正确的索引
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException(index+"索引越界啦！！！");
        }
        return elementData[index];
    }
    /**
     * 根据索引移出
     * @param index 要删除数据的索引
     * @return 被移出的数据
     */
    public String remove(int index){
        // 判断是否为正确的索引
        if (index<0 || index>=size){
            throw new IndexOutOfBoundsException(index+"索引越界！");
        }
        // 1. 备份原数组
        String[] temp=elementData;
        // 2. 创建新数组
        elementData=new String[size+1];
        // 3. 遍历原数组进行数据的拷贝
        for(int i=0;i<size;i++){
            if(i>=index){
                if(i==index){
                    continue;
                }
                elementData[i-1]=temp[i];
            }else{
                elementData[i]=temp[i];
            }
        }
        // 4. 长度 -1
        size--;
        return temp[index];
    }
    //  返回集合中数据的个数
    public int size(){
        return this.size;
    }

    @Override
    public String toString() {
        return "MyContainer{" +
                "elementData=" + Arrays.toString(elementData) +
                ", size=" + size +
                '}';
    }
}
