package com.it.study.ExceptionAndAPI14.aa.a;
/*
1.先创建一个异常类型
2.继承一个系统的异常类
      想要定义编译时异常  继承系统编译时异常
      想要定义运行时异常  继承系统运行时异常
3.写俩构造器
       无参
       有参(String message)




 */
public class PersonTest {
    public static void main(String[] args) {


        Person p1 = new Person();


        p1.setName("张三");
        try {
            p1.setAge(200);
            p1.setSex('男');
        } catch (AgeException e) {
            e.printStackTrace();
        }



        System.out.println("p1 = " + p1);

    }
}
