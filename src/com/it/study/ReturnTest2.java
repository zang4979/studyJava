package com.it.study;
/*




[public] static void 方法名([形参列表]){

}
void： 当前方法么有返回值

数据类型：int double String ...
        则【必须】返回一个该类型【匹配的值】


定义一个方法 判断任意整数 是否为偶数

是   在方法调用处 打印 true
不是 在方法调用处 打印 false


定义一个方法 求整数的和 将和在方法调用处打印

 */

public class ReturnTest2 {

    public static double sum(int a,int b){
        //double 做返回值类型 int 会自动类型提升
        return a+b;//int
    }
    public static void main(String[] args) {


        double sum = sum(10, 20);

        System.out.println("sum = " + sum);

        System.out.println(sum(3,5));


    }
}
