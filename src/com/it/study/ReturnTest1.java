package com.it.study;
/*


定义一个方法 判断任意整数 是否为偶数

是   在方法调用处 打印 true
不是 在方法调用处 打印 false

[public] static void 方法名([形参列表]){

}
void： 当前方法么有返回值

数据类型：int double String ...
        则【必须】返回一个该类型匹配的值

 */



public class ReturnTest1 {

    public static void main(String[] args) {

      boolean result =   isEven(21);

        System.out.println("result = " + result);


        System.out.println(isEven(12));

    }
    //判断 num 是不是偶数
    public static boolean isEven(int num){

        if(num%2==0){
            return true;
        }else{
            return false;
        }

      //  return true;
    }
}
