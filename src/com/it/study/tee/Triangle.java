package com.it.study.tee;

public class Triangle {
    double a;
    double b;
    double c;

    boolean isRightTriangle() {
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && b + c > a) {
                if (a * a + b * b == c * c || a * a + c * c == b * b || c * c + b * b == a * a) {


                }
                return true;
            }

        }
        return false;

    }

    boolean islsoscelesTriangle() {
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && b + c > a) {
                if (a == b || a == c || b == c) {


                }
                return true;

            }


        }
        return false;
    }

    boolean isEquilateralTriangle() {
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && b + c > a) {
                if (a == b && a == c) {


                }
                return true;

            }

        }
        return false;
    }

    double getArea(){
        if (a>0&&b>0&&c>0) {
            if (a+b>c&&a+c>b&&b+c>a ) {
                double p =(a+b+c)/2;
                return  Math.sqrt(p=p*(p-a)*(p-b)*(p-c));
            }

        }

        return 0;

    }
    double getLength(){
        if (a>0&&b>0&&c>0) {
            if (a+b>c&&a+c>b&&b+c>a ) {
                return a+b+c;

            }

        }


        return 0;
    }

}

