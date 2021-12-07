package com.it.study;

public class FeiBo {
    public static void main(String[] args) {
        int feiBo= g(24);
        System.out.println("feiBo="+feiBo);

    }
    public static int g(int p){
        if (p == 1 ||p==2) {
            return 1;

        }
        return g(p-1)+ g(p-2);
    }
}
