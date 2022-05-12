package com.month_3.test_319;

import java.io.*;
import java.util.Arrays;

/*
        Object流|对象流|引用数据类型流
 */
public class Test_IO_1908 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // testWrite("D://heihei.txt");
        testRead("D://heihei.txt");

    }

    public static void testRead(String path) throws IOException, ClassNotFoundException {
        //  1. 构建输入流
        ObjectInputStream is=new ObjectInputStream(new FileInputStream(path));
        // 2. 读入数据
        Person p = (Person) is.readObject();
        int[] arr = (int[]) is.readObject();
        // 3. 处理数据
        System.out.println(p);
        System.out.println(Arrays .toString(arr));

    }

    // 序列化输出流
    public static void testWrite(String path) throws IOException {
        // 1. 定义输出流
        ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(path));
        //  2. 准备数据
        Person p=new Person("张三",18);
        //p.a=10;
        int[] arr={1,2,3,4,5};
        // 3.写出
        os.writeObject(p);
        os.writeObject(arr);
        // 4. 刷出
        os.flush();
        //5. 关闭
        os.close();

        // p.a=100;
    }
}

class Person implements Serializable{
    private static final long serialVersionUID=-1108656603703788489L;
    private String name;
    private transient int age;
    public static int a;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Person.a = a;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}