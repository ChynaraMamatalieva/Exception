package com.company;

public class InvalidAgeException extends Exception{
    private static final String message = "Sizdin jashynyz jete elek, chonoup anan keliniz";
    public String error;

    public InvalidAgeException() {
        super(message);
    }

    public InvalidAgeException(String error) {
        this.error = error;
    }
}
