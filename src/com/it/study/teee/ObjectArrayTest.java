package com.it.study.teee;
/*
测试类ObjectArrayTest的main中创建一个可以装3个学生对象的数组
，并且按照学生成绩排序，显示学生信息
 */
public class ObjectArrayTest {
    public static void main(String[] args) {

        //创建数组
        Student [] sArr = new Student[4];

        Student s1 = new Student();
        s1.name = "张三";
        s1.score=90;
        Student s2 = new Student();
        s2.name = "李四";
        s2.score=89;
        sArr[0]=s1;
        sArr[1]=s2;

        sArr[2] = new Student();
        sArr[2].name="王五";
        sArr[2].score=93;

        sArr[3] = new Student();

        sArr[3].name="赵六";
        sArr[3].score=83;
        for (Student student : sArr) {
            String info = student.getInfo();
            System.out.println("info = " + info);
        }


    }
}
