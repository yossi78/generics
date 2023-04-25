package com.example.generics.services;

// from web
// main class
public class Lab {




    public static void main(String[] args) {
        Printable dog=new Dog();
        Printable cat=new Cat();
        Printer<Printable> dogPrinter=new Printer<>(dog);
        Printer<Printable> catPrinter=new Printer<>(cat);
        dogPrinter.print();
        catPrinter.print();


    }



}

