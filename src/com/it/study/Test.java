package com.it.study;
/*
（1）包含属性：长、宽

（2）包含3个方法：

    1. 求面积、
    2. 求周长、
    3. 返回矩形对象的信息：长：xx，宽：xx，面积：xx，周长：xx
 */
public class Test {
    public static void main(String[] args) {

        //创建矩形对象

        Rectangle r1 = new Rectangle();

        r1.width=10;
        r1.length=20;

        String info = r1.getInfo();

        System.out.println("info = " + info);

        //创建矩形对象2

        Rectangle r2 = new Rectangle();

        r2.length=40;
        r2.width=20;

        String info1 = r2.getInfo();

        System.out.println("info1 = " + info1);


    }
}
