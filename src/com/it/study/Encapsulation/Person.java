package com.it.study.Encapsulation;

public class Person {
    private static String country;
    private String name;
    private int aga;
    private boolean marry;
    public static void setCountry(String c){
        country = c;
    }
    public static String getCountry(){
        return country;
    }
    public void  setName(String n){
        name = n;

    }
    public String getName(){
        return name;
    }
    public void setAga(int a){
        aga=a;

    }
    public int getAga(){
        return aga;

    }
    public void  setMarry(boolean m){
        marry =m;
    }
    public  boolean isMarry(){
        return  marry;
    }


    public void setSex() {
    }
}
