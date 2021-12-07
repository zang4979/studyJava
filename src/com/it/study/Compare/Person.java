package com.it.study.Compare;

public class Person implements Comparable{

    String name;
    int age;
    double salary;

    @Override
    public int compareTo(Object o) {// Object o = p2;
        //this:代指当前对象

       //想要比较的是 Person中的属性 因此需要向下转型
        Person p = (Person)o;

        return this.age- p.age;
    }


    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }


}
