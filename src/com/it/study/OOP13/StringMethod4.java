package com.it.study.OOP13;

import org.junit.Test;

import java.util.Arrays;

public class StringMethod4 {
    @Test
    public void test01(){
        String s = "ABCDE";
        //获取指定位置的字符
        char c = s.charAt(2);
        System.out.println("c = " + c);


    }

    @Test
    public void test02(){
        //对字符串遍历
        String s = "ABCDE";

        //index：代表字符串下标
        for(int index = 0;index<s.length();index++){


            char c = s.charAt(index);

            System.out.println("c = " + c);

        }
        System.out.println("---------");
        String s1 = "你好世界";

        for (int i = 0; i < s1.length(); i++) {

            char c = s1.charAt(i);
            System.out.println("c = " + c);
        }

    }
    @Test
    public void test03(){


        String s = "ABCDEF";
        //将字符串转为字符数组
        char[] chars = s.toCharArray();


        String s1 = Arrays.toString(chars);

        System.out.println("s1 = " + s1);


    }


}
