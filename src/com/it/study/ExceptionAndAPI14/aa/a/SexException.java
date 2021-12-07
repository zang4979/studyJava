package com.it.study.ExceptionAndAPI14.aa.a;
/*
先创建一个异常类型 SexException

想要定义运行时异常  继承系统运行时异常
 */
public class SexException extends ArrayIndexOutOfBoundsException{

    public SexException() {
    }
    public SexException(String s) {
        super(s);
    }
}
