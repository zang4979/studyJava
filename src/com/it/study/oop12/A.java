package com.it.study.oop12;

public interface A {
    interface A1{
        default void showB() {
        }
    }
    class B implements A{
        public void showA(){
            System.out.println("AAAAA");
        }

        public void showB() {
            System.out.println("BBBBB");


        }
    }
}
