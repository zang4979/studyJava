package com.it.study.tee;

public class Test6 {
    public static void main(String[] args) {
        int a= 5;
        int b =6;
        System.out.println("a+b="+ MyDate.MathTools.add(a,b));
        System.out.println("a-b="+ MyDate.MathTools.subtract(a,b));
        System.out.println("a*b="+ MyDate.MathTools.mutiply(a,b));
        System.out.println("a/b="+ MyDate.MathTools.divide(a,b));
        System.out.println("a%b="+ MyDate.MathTools.remainder(a,b));
        System.out.println("ab谁最大"+ MyDate.MathTools.max(a,b));
        System.out.println("ab谁最小："+ MyDate.MathTools.min(a,b));
        System.out.println("ab是否相等："+ MyDate.MathTools.equals(a,b));
        System.out.println("a是否为偶数："+ MyDate.MathTools.isEven(a));
        System.out.println("a是否为素数："+ MyDate.MathTools.isPrimeNumer(a));
        System.out.println("a="+ MyDate.MathTools.round(a));
    }
}
