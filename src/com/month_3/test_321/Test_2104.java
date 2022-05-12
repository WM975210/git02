package com.month_3.test_321;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
         泛型
 */
public class Test_2104 {
    public static void main(String[] args) {
        Collection<String> col=new ArrayList<String>();
        col.add("2022");
        col.add("上海");
        col.add("优极限学堂");

        //  遍历方式

        for (String str:col){
            System.out.println(str);
        }
        Iterator<String> it= col.iterator();
        while(it.hasNext()){
            String s= it.next();
            System.out.println(s);
        }
    }
}
