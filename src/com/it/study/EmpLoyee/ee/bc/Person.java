package com.it.study.EmpLoyee.ee.bc;

public class Person {
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}
class Student extends Person{
    @Override
    public void eat() {
        System.out.println("学生吃饭");
    }
    public void study(){
        System.out.println("学生学习");
    }
}
