package com.month_3.test_329;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/*
    DOM4J解析:
        1.查询,遍历
            1)创建流,加载xml文件
            2)获取Document对象
            3)遍历
        2.写出
        3.创建
        4.删除或者修改

 */
public class XML_2904 {
    public static void main(String[] args) throws IOException, DocumentException {
        //writeToFile(createDocument(),"src/yjxxt.xml");
       writeToFile(update(getDocument("src/yjxxt.xml")),"src/yjxxt.xml");
    }

    // 修改与删除
    public static Document update(Document document){
        //1.找到id属性值为2的元素,删除子标签tuition
        Element root=document.getRootElement();
        List<Element> list=root.elements();
        list.forEach(e->{
            String idValue=e.attributeValue("id");
            if (idValue.equals("2")){
                // 父节点.remove（子节点）
                Element removeElement=e.element("tuition");
                e.remove(removeElement);
            }
        });
        // 2.找到shyjxxt，学费涨价1w
        Element shyjxxt=root.element("shyjxxt");
        Element tuition=shyjxxt.element("tuition");
        tuition.setText(Integer.parseInt(tuition.getText())+10000+"");

        return document;
    }
    // 写出
    public static void writeToFile(Document document,String path) throws IOException {
        // 1、构建XMLWriter
        XMLWriter writer=null;
        // 2.构建输出格式
        OutputFormat format=OutputFormat.createPrettyPrint();
        writer=new XMLWriter(new FileWriter(path),format);
        // 3.写出
        writer.write(document);
        //4.刷出
        writer.flush();
        //5.关闭
        writer.close();
    }
    /*  创建Document
            <yixxt>
                <shyjxxt>
                    <location>上海市浦东新区</location>
                    <date>2021-10-10</date>
                </shyjxxt>
                <bjyjxxt>
                    <location>北京市朝阳区</location>
                    <date>2022-12-12</date>
                </bjyjxxt>
            </yjxxt>
     */
    public static Document createDocument(){
        // 1) 创建Document
        Document document= DocumentHelper.createDocument();
        // 2) 添加根元素
        Element root=document.addElement("yjxxt");
        //3) 根元素中国添加子元素
        Element shyjxxt=root.addElement("shyjxxt");
        Element bjyjxxt=root.addElement("bjyjxt");
        shyjxxt.addElement("location").addText("上海市浦东新区");
        shyjxxt.addElement("date").addText("2021-10-10");
        bjyjxxt.addElement("location").addText("北京市朝阳区");
        bjyjxxt.addElement("date").addText("2021-10-12");

        return document;
    }
    // 遍历
    public static void print(Document document){
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
    // 加载xml文件 获取Document
   public static Document getDocument(String path) throws DocumentException {
        //1)创建流，加载xml文件
        SAXReader reader=new SAXReader();
        //2)获取Document对象
        Document document=reader.read(new File(path));
        return document;
   }
}
