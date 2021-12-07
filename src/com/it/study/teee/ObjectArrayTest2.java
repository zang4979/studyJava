package com.it.study.teee;
/*
按照成绩排序展示
 */
public class ObjectArrayTest2 {
    public static void main(String[] args) {
        //创建数组
        //准备数据
        Student[] sArr = getStudents();

        //排序前
        showStudents(sArr, "排序前 ");

        //排序
        sort(sArr);


        //排序后
        System.out.println();
        System.out.println();
        showStudents(sArr, "排序后 ");

    }

    public static void sort(Student[] sArr) {
        for (int i = 0; i < sArr.length-1; i++) {
            for(int j = 0;j<sArr.length-1-i;j++){
                //如果前一个学生的成绩 > 后一个学生的成绩 前后学生进行位置交换
              if(sArr[j].score>sArr[j+1].score){
                  //临时变量 Student
                  Student temp = sArr[j];
                  sArr[j] = sArr[j+1];
                  sArr[j+1]=temp;
              }
            }
        }
    }

    public static void showStudents(Student[] sArr, String s2) {
        for (Student s : sArr) {
            System.out.println(s2 + s.getInfo());
        }
    }

    public static Student[] getStudents() {
        Student s1 = new Student();
        s1.name = "张三";
        s1.score=90;

        Student s2 = new Student();
        s2.name = "李四";
        s2.score=89;

        Student s3 = new Student();
        s3.name="王五";
        s3.score=93;

        Student s4 = new Student();
        s4.name="赵六";
        s4.score=83;

        return new Student[]{s1,s2,s3,s4};
    }
}
