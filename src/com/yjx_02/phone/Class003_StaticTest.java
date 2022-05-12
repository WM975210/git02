package com.yjx_02.phone;

public class Class003_StaticTest {
    public static int id;
    public int age;

    public static void main(String[] args) {
        Class003_StaticTest class003_StaticTest = new Class003_StaticTest();

        System.out.println(Class003_StaticTest.id);   //   0
        System.out.println(class003_StaticTest.age);   //  0

        class003_StaticTest.change(); //id=   age=    //id=   class003_StaticTest.age=
        System.out.println(Class003_StaticTest.id); //
        System.out.println(class003_StaticTest.id);  //
        System.out.println(class003_StaticTest.age);  //age=
        class003_StaticTest.change();  ///    //
        System.out.println(id);  //
        System.out.println(class003_StaticTest.age);  //


    }
    public void change() {
        Class003_StaticTest class003_StaticTest = new Class003_StaticTest();
        class003_StaticTest.age++;  //
        Class003_StaticTest.id++;  //
        System.out.println("In change(): id = " + id + " age = " + age);  //id=   age=   //
        System.out.println("In change(): id = " + id + " Class003_StaticTest.age = " + class003_StaticTest.age);
        //id= Class003_StaticTest.age=   //
    }
}
