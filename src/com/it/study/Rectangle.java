package com.it.study;

public class Rectangle {


    int length;
    int width;

    public int getArea(){
        return length*width;
    }

    public int getP(){
        return (length+width)*2;
    }


    public String getInfo(){

        int area = getArea();


        return "长："+length+",宽："+width+",面积："+area+",周长："+getP();

    }



}
