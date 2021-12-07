package com.it.study.EmpLoyee.ee.aa;
/*
抽象：既不具体  也无法具体

抽象类：   对一类事物共有特征的描述 不能创建对象的
抽象方法： 对子类的约束  天生就是被重写的

   is a 的关系   Cat is a Animal   Dog is a Animal

注意：
    0.声明抽象类
       abstract class 类名{}
      声明抽象方法
      权限修饰符 abstract 返回值类型 方法名();

    1.抽象类中可以存在 普通的属性 方法 静态方法

    2.抽象类中可以么有抽象方法

    3.如果一个类继承了抽象类  1 实现所有的抽象方法 2此类也变为抽象类

    4.抽象方法必须存在于抽象类中

    5.抽象方法不能被 static final  private 修饰
 */
public class Test {
    public static void main(String[] args) {

        Animal a = new Dog();

        a.eat();
        a.sleep();


    }
}
