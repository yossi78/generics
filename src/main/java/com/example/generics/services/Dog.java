package com.example.generics.services;

public class Dog implements Printable{


    @Override
    public void printNow() {
        System.out.println("I AM A DOG");
    }


    @Override
    public String toString() {
        return "I AM A DOG FROM TO-STRING";
    }
}
