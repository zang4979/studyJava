package com.it.study.tee12.ee;
/*
接口： 指定标准    has a的关系

声明接口：
    interface 接口名{

        抽象方法
    }
使用接口：
    类 implements 接口名{

        重写抽象方法

    }
注意：
    1.如果一个类实现了接口 那么可以把此类看成是接口的孩子

 */
public class Test {
    public static void main(String[] args) {

        Bird bird = new Bird();

        bird.fly();

        //多态
        Fly fly = new SuperMan();

        fly.fly();

    }
}
