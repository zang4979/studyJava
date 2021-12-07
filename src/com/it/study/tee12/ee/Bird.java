package com.it.study.tee12.ee;

public class Bird implements Fly {

    @Override
    public void fly() {
        System.out.println("小鸟飞....");
    }
}

class SuperMan implements Fly{

    @Override
    public void fly() {
        System.out.println("超人飞....");
    }
}
