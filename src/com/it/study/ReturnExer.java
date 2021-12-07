package com.it.study;
/*

键盘输入一个数 判断该数是不是质数
 是 返回 true

 不是 返回false
 */
public class ReturnExer {

    /*
    判断是否为质数
     */
    public static boolean isZhiShu(int num){
        //10  2~9
        //确定约数范围
        for (int i = 2; i <num ; i++) {
            if(num % i==0){
                return false;
            }
        }

        //兜底的值
        return true;
    }


    public static void main(String[] args) {


        System.out.println("isZhiShu(7) = " + isZhiShu(7));

        System.out.println("isZhiShu(9) = " + isZhiShu(9));

    }
}
