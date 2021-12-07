package com.it.study.Encapsulation;

public class Emplpyee {
    private String id;
    private String name;
    private double salary;
    private char gender;

    public Emplpyee() {

    }

    public Emplpyee(String id, String name) {
        this.id = id;
        this.name = name;

    }

    public Emplpyee(String id, String name, double salary, char gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.gender = gender;

    }

    public String getId() {
        return id;

    }

    public void setId(String id) {
        this.id = id;

    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;

    }

    public double getSalary() {
        return salary;

    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getInfo() {
        return "编号：" + id + "姓名：" + name + "xinzi：" + salary + "性别：" + gender;
    }


}
