package com.company;

public class MyException extends Exception{
    public String error;

    public MyException(String message, String error) {
        super(message);
        this.error = error;
    }
}
