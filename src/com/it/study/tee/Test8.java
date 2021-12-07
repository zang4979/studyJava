package com.it.study.tee;

public class Test8 {
    public static void main(String[] args) {
        System.out.println("3月："+CommonsTools1.getMonthName(4));
        System.out.println("周三："+CommonsTools1.getWeekName(5));
        System.out.println("2014-3的总天数："+CommonsTools1.getTotalDaysOfMonth(2014,4));
        System.out.println("2014是否闰年："+CommonsTools1.isLeapYear(2014));
        System.out.println("2014的总天数："+CommonsTools1.getTotalDaysOfYear(2019));
    }
}
