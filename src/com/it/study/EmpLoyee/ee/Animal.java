package com.it.study.EmpLoyee.ee;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Animal {
    String mame;
    int age;
    private String color = "黑色";
    public void eat(){
        System.out.println("吃饭");
    }
    static class Cat extends Animal{

        public void catchMouse() {
            System.out.println("抓老鼠");
        }
    }
    static class Dog extends Animal{

        public void lookHome() {
            System.out.println("小狗");
        }
    }
    class Bidog extends Dog {
        private void ch(){
            System.out.println("ee");
        }
    }
}
