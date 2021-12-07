package com.it.study.tee;

public class MyDateNew {
    int year;
    int month;
    int day;

    boolean isYear() {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }

    }

    int returnMonth() {
        return month;
    }
    void set(int y,int m,int d){
        year =y;
        month =m;
        day =d;

    }

     String toS() {
        return "MyDateNew{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
