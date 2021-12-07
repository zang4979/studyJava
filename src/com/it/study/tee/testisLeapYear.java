package com.it.study.tee;

public class testisLeapYear {
    public testisLeapYear(int year) {
    }

    public static void main(String[] args) {
        MyDateNew myDateNew = new MyDateNew();
        myDateNew.year = 2008;
        myDateNew.month = 2;
        myDateNew.day =20;

        boolean y = myDateNew.isYear();
        int a = myDateNew.returnMonth();
        String s = myDateNew.toS();
        System.out.println(s);
        System.out.println(y);
        System.out.println(a);
        System.out.println(myDateNew.toString());
        myDateNew.set(1997,2,12);
        System.out.println(myDateNew.toS());
        myDateNew.isYear();



    }
}
