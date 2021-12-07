package com.it.study.ExceptionAndAPI14.aa.a;

public class Person {

    private String name;
    private int age;
    private char sex;


    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)throws AgeException {

        if (age >= 1 && age <= 150) {
            this.age = age;
        } else {
            throw new AgeException("年龄 " + age + " 有问题");
        }

    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {

        if (sex == '男' || sex == '女') {
            this.sex = sex;
        } else {

            throw new SexException("性别有问题 看清楚再添加");
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
