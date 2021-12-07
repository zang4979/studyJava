package com.it.study.EmpLoyee.ee.aa;

public abstract class Animal  {

       abstract void eat();
    abstract void sleep();


}

class Dog extends Animal{


    @Override
    void eat() {
        System.out.println("小狗吃骨头");
    }
    @Override
    void sleep() {
        System.out.println("小狗睡觉");

    }
}
