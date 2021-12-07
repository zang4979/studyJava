package com.it.study.oop12.cc;

public class Test4 {
    public static void main(String[] args) {
        User[] all = new User[15];
        for (int i = 0; i < all.length; i++) {
            all[i] = new User(null, i + 1);

        }
        V1Filter V1F = new V1Filter();
        V2Filter V2F = new V2Filter();
        AFilter aF = new AFilter();
        Receptionist r1 = new Receptionist(V1F);
        for (int i = 0; i < 5; i++) {
            r1.recept(all[i]);

        }
        Receptionist r2 = new Receptionist(V2F);
        for (int i = 5; i < 10; i++) {
            r2.recept(all[i]);

        }
        Receptionist r3 = new Receptionist(aF);
        for (int i = 10; i < 15; i++) {
            r3.recept(all[i]);

        }
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);

        }
    }
}
