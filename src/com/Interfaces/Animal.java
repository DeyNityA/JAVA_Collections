package com.Interfaces;
//The interface in Java is a mechanism to achieve abstraction. Abstraction means hiding the implementation
// details and showing only the functionality. There can be only abstract methods in the Java interface,
// not method body

//An interface can also be used to achieve multiple inheritance in Java, which means a class can implement
// more than one interface. An interface can extend another interface, but a class can only extend one class

//interface-interface-->extends
//interface-class----->implements
public interface Animal {
    int count=0;  //all variables are public,static and final by default

    //all methods will be abstract,public by default
    void animalSound();
    void run();
    void sleep();


    default void show(){
        System.out.println("maa chudao");
    }

    static void lodu(){
        System.out.println("Lodu he tu");
    }
    //default and static are also by default public
    //default i can override, but static i can't and also can't inheritaed
}
