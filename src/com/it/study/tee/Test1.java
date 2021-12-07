package com.it.study.tee;

public class Test1 {
    public static void main(String[] args) {
        Mployee mployee = new Mployee();
        Mployee mployee1 = new Mployee();
        Mployee mployee2 = new Mployee();
        mployee.id = 12;
        mployee.name = "小李";
        mployee.ege = 24;
        mployee.salary = 1252;
        System.out.println(mployee.id+"\n"+mployee.name+"\n"+mployee.ege+"\n"+mployee.salary);

        mployee1.id =  45;
        mployee1.name = "zhang";
        mployee1.ege = 45;
        mployee1.salary = 45245;
        System.out.println(mployee1.id+"\n"+ mployee1.name+"\n"+ mployee1.ege+"\n"+ mployee1.salary);


        MyDateNew myDateNew = new MyDateNew();



    }

}
