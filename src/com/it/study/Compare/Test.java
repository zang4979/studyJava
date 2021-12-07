package com.it.study.Compare;
/*
对象在比较前 要指明比较规则 才能进行比较
java作者 提供了一个比较的接口  Comparable 用于比较对象
Comparable (内部比较器)接口的使用：
    1.让比较对象所在的类 实现 Comparable接口

    2.重写抽象方法 compareTo(Object obj);

    3.在方法内制定比较规则
        如果返回>0  前一个对象> 后一个对象
        如果返回=0  前一个对象 = 后一个对象
        如果返回<0  前一个对象< 后一个对象


 */
public class Test {
    public static void main(String[] args) {

        Person p1 = new Person("张三", 28, 8888.8);
        Person p2 = new Person("李四", 28, 8888.9);

        int i = p1.compareTo(p2);

        System.out.println("i = " + i);


        int a  =10;
        int b = 20;

        System.out.println(a>b);


    }
}
