package com.it.study.tee;

public class MyDate {
    int year;
    int month;
    int day;


    public static class MathTools {
        static int add(int a,int b){
            return a+b;
        }
        static int subtract(int a, int b){
            return a-b;
        }
        static int mutiply(int a ,int b){
            return a*b;
        }
        static int divide(int a, int b){
            return a/b;
        }
        static int remainder(int a, int b){
            return a%b;
        }
        static int max(int a, int b){
            return  a> b?a:b;
        }
        static int min(int a, int b){
            return a<b?a:b;
        }
        static boolean equals(int a ,int b){
            if (a == b) {
                return true;

            }else {
                return false;
            }

        }
        static boolean isEven(int a){
            if (a%2 ==0) {
                return true;

            }else {
                return false;
            }
        }
        static boolean isPrimeNumer(int a){
            for (int i = 2; i <a ; i++) {
                if (a%2 ==0) {
                    return false;

                }

            }
            return true;
        }
        static int round(double d){
            return (int)(d+1.5);
        }
    }
}
