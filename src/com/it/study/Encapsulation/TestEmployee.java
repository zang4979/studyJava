package com.it.study.Encapsulation;

public class TestEmployee {
    public static void main(String[] args) {
        Emplpyee e1 = new Emplpyee();
        System.out.println(e1.getGender());

        Emplpyee e2 = new Emplpyee("1144","李四",10000,'男');
        System.out.println(e2.getGender());

        e2.setGender('女');
        System.out.println(e2.getGender());

        System.out.println("e1薪资："+e1.getGender());

    }
}
