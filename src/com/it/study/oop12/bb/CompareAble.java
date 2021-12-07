package com.it.study.oop12.bb;

public interface CompareAble {
    default void compare(Apple a1, Apple a2) {
        System.out.println("最大的桃子");
        if (a1.getSize() > a2.getSize()) {
            System.out.println(a1);


        } else {
            System.out.println(a2);
        }
    }
}

class CompareBig implements CompareAble {

}

class CompareColor implements CompareAble {
    @Override
    public void compare(Apple a1, Apple a2) {
        System.out.println("挑红的：");
        if ("红色".equals(a1.getColor())) {
            System.out.println(a1);


        }
        if ("红色".equals(a2.getColor())) {
            System.out.println(a2);

        }
    }
}

class Worker {
    public void pickApple(CompareAble c, Apple a1, Apple a2) {
        c.compare(a1, a2);
    }
}
