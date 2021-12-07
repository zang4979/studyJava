package com.it.study.tee;

public class Test5 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.a =4;
        t.b =5;
        t.c =6;
        System.out.println("是否是三角形："+t.isRightTriangle());
        System.out.println("是否是三角形："+t.islsoscelesTriangle());
        System.out.println("是否是三角形："+t.isEquilateralTriangle());
        System.out.println("是否是三角形："+t.getArea());
        System.out.println("是否是三角形："+t.getLength());
    }
}
