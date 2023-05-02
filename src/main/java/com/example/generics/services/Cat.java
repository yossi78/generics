package com.example.generics.services;

public class Cat implements Printable{


    @Override
    public void printNow() {
        System.out.println("I AM A CAT");
    }

    @Override
    public String toString() {
        return "I AM A CAT FROM TO-STRING";
    }
}
