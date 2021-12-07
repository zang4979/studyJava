package com.it.study.tee;

public class MathToolp {
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int mutiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    static int remainder(int a, int b) {
        return a % b;
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;

        } else {
            return b;
        }

    }

    static int min(int a, int b) {
        return a < b ? a : b;
    }

    static boolean ewuals(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }

    }

    static boolean isEven(int a, int b) {
        if (a % 2 == 0) {
            return true;

        } else {
            return false;
        }


    }

    static boolean isPrimeNumer(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;

            } else {
                return true;
            }

        }

        return false;
    }
    static int round(int a){
        return (int) (a+0.5);
    }
}












