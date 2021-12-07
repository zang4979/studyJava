package com.it.study.tee;

public class Test2 {
    public static void main(String[] args) {
        MyDate bir = new MyDate();
        MyDate shangGuigu = new MyDate();
        MyDate graduationDate = new MyDate();
        bir.year =1997;
        bir.month =12;
        bir.day = 27;
        System.out.println("我的生日是："+bir.year+"年"+bir.month+"月"+"日");

        shangGuigu.year = 2021;
        shangGuigu.month = 11;
        shangGuigu.day = 17;
        System.out.println("来尚硅谷日期："+shangGuigu.year+"年"+shangGuigu.month+"月"+shangGuigu.day+"日");

        graduationDate.year =2022;
        graduationDate.month =6;
        graduationDate.day = 1;
        System.out.println("毕业日期："+graduationDate.year+"年"+graduationDate.month+"月"+graduationDate.day+"日");

    }
}
