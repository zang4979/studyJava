package com.it.study.OOP13;

public class Test5 {
    static int i = 0;

    public static void main(String[] args) {
        System.out.println(test());
    }
    public static int test(){
        try{
            return ++i;
        }finally {
            return ++i;
        }
    }
}
