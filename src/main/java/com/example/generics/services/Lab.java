package com.example.generics.services;


public class Lab {



    public static <T, V> void printTwoThing(T first, V second){
        System.out.println(first);
        System.out.println(second);
    }

    public static <T> void printAnyThing(T anyThingToPrint){
        System.out.println(anyThingToPrint);
    }


    public static void main(String[] args) {
        Printable dog=new Dog();
        Printable cat=new Cat();
        Printer<Printable> dogPrinter=new Printer<>(dog);
        Printer<Printable> catPrinter=new Printer<>(cat);
        dogPrinter.print();
        catPrinter.print();
        System.out.println("----------------------------------------------------------");


        printAnyThing("String-printing");
        printAnyThing(5);
        printAnyThing(cat);

        System.out.println("----------------------------------------------------------");

        printTwoThing("str",9);






    }



}

