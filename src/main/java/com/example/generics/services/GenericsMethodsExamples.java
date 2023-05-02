package com.example.generics.services;

import java.util.ArrayList;
import java.util.List;

public class GenericsMethodsExamples {


    public static <T, V> void printTwoThing(T first, V second){
        System.out.println(first);
        System.out.println(second);
    }

    public static <T> void printAnyThing(T anyThingToPrint){
        System.out.println(anyThingToPrint);
    }


    public static void printList(List<? extends Printable> list){
        list.stream().forEach(c->{
            System.out.println(c);
        });
    }


    public static void main(String[] args) {
        Printable cat1=new Cat();
        Printable cat2=new Cat();
        List<Cat> catList=new ArrayList<>();
        catList.add((Cat) cat1);
        catList.add((Cat) cat2);

        Printable dog1=new Dog();
        Printable dog2=new Dog();
        List<Dog> dogList = new ArrayList<>();
        dogList.add((Dog) dog1);
        dogList.add((Dog) dog2);


        System.out.println("-------------- PRINT STRING --------------------------------------------");
        printAnyThing("String-printing");

        System.out.println("-------------- PRINT INTEGER --------------------------------------------");
        printAnyThing(5);

        System.out.println("-------------- PRINT CAT --------------------------------------------");
        printAnyThing(cat1);

        System.out.println("--------------PRINT TWO GENERIC VALUES--------------------------------------------");
        printTwoThing("str",9);

        System.out.println("------------PRINT CAT LIST WITH METHOD USING WILDCARD ----------------------------------------------");
        printList(catList);

        System.out.println("------------PRINT DOG LIST WITH METHOD USING WILDCARD ----------------------------------------------");
        printList(dogList);




    }




}
