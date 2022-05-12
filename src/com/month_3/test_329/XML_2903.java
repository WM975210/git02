package com.month_3.test_329;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.xml.parsers.SAXParser;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/*
    XML 是标记语言
        1.学习xml文件的编写语法  *****
        2.学习xml解析  ****
        3.了解约束
    DOM4J解析:
        1.查询,遍历
            1)创建流,加载xml文件
            2)获取Document对象
            3)遍历
        2.写出
        3.创建
        4.删除或者修改
 */
public class XML_2903 {
    public static void main(String[] args) throws DocumentException {
        //1)创建流,加载xml文件
        SAXReader reader=new SAXReader();
        //2)获取Document对象
        Document document=reader.read(new File("src/persons.xml"));
        //3)遍历
        // 获取根节点
        Element root=document.getRootElement();
        System.out.println("根元素标签名"+root.getName()); // 根元素标签名Persons

        // 获取子元素
        List<Element> list=root.elements();
        // 遍历子元素
        list.forEach(e->{
            System.out.println("标签名："+e.getName()+"-->id属性=" +e.attributeValue("id"));
            // 迭代所有子元素的迭代器
            Iterator<Element> it=e.elementIterator();
            while (it.hasNext()){
                Element ele=it.next();
                System.out.println(ele.getName()+"--->"+ele.getData());
            }
        });
    }
}
