package com.it.study;
/*
方法的形参与实参：


定义一个方法 输出【任意】两个整数的值
  1  2
  10 20
  100 200

形参：
    0.位置在方法的声明处
    1.规定了方法调用处传递的实参的数量
    2.规定了方法调用处传递的实参的类型
    3.形参的声明  数据类型 变量名
                sum(int m,int n)
实参：
   在方法的调用处
   给形参赋值
 注意：
    1.实参给形参传值  类型匹配即可 大的类型可以接收小的类型的数据

 */

public class MethodTest1 {
    static void show(String s,double d){
        System.out.println("---->   "+s+d);
    }



    public static void main(String[] args) {

        show("你好", 3.14);

        show("世界", 100);

        System.out.println("-----------------------------------");
        sum(10,20);
        System.out.println("------");
        sum(100,200);//实参
        int c  =1;
        int d = 2;
        sum(c, d);


    }
    //方法的声明
    public static void sum(int m,int n){//形参

       /* int m = 10;
        int n = 20;*/
        System.out.println(m+n);
    }


}
