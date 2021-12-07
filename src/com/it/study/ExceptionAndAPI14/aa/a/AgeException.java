package com.it.study.ExceptionAndAPI14.aa.a;

import java.io.FileNotFoundException;

public class AgeException  extends FileNotFoundException {

    public AgeException(){}

    public AgeException(String message){
        super(message);
    }
}
