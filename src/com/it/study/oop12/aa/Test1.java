package com.it.study.oop12.aa;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("选择：");
        String role1 =input.next();
        FightAble f1 = Player.select(role1);
        f1.specialFight();
        f1.commonFight();
        System.out.println("选择：");
        String role2 = input.next();
        FightAble f2 = Player.select(role2);
        f2.specialFight();
        f2.commonFight();

        input.close();
    }
}
