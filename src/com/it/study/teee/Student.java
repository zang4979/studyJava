package com.it.study.teee;
/*
（1）定义学生类Student**

​	**声明姓名和成绩实例变量，**

​	**getInfo()方法：用于返回学生对象的信息**
 */
public class Student {

    String name;
    int score;

    public String getInfo(){
        return "name = "+name+",score = "+ score;
    }
}
