package com.it.study;

public class Dee {
    public static void main(String[] args) {
        int sum = getSum(10);// 5 + 4+ 3+2 + 1
        System.out.println("sum = " + sum);//5050
    }

    public static int getSum(int num){
        if(num==1){
            return 1;
        }
        num=num*(num-1);
        return num+getSum(num-1);

    }
}

