package com.example.generics.services;

import java.io.Serializable;

public class Printer<T extends Printable> {


    private T printable;

    public Printer(T printable){
        this.printable=printable;

    }
    public void print(){
        printable.printNow();
    }
}
