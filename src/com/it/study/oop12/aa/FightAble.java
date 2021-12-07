package com.it.study.oop12.aa;

public interface FightAble {
    void specialFight();
    default void commonFight(){
        System.out.println("普通攻击");
    }
}
class Soldier implements FightAble{
    @Override
    public void specialFight() {
        System.out.println("武器攻击");

    }
 }
 class Mage implements FightAble{
     @Override
     public void specialFight() {
         System.out.println("法术攻击");
     }
 }


