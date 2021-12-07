package com.it.study.oop12.aa;

public class Player {

        public static FightAble select(String str){
            if("法力角色".equals(str)){
                return new Mage();
            }else if ("武力角色".equals(str)) {
                return new Soldier();

            }
            return null;
        }
}
