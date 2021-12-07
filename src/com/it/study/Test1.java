package com.it.study;
/*
基本类型的值传递
    1. 形参 是当前方法的局部变量
    2.基本数据类型传递的是 值的副本

 */
public class Test1 {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        System.out.println("交换前：m = "+ m+",n = "+ n);//10 20

        swap(m, n);

        System.out.println("交换后：m = "+ m+",n = "+ n);//20 10      10  20
    }
    public static void swap(int m,int n){

        int temp = m;
        m = n;
        n = temp;

        System.out.println("交换中：m = "+ m+",n = "+ n);//20 10
    }
}
