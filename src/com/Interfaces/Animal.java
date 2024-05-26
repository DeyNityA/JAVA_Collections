package com.Interfaces;
//The interface in Java is a mechanism to achieve abstraction. Abstraction means hiding the implementation
// details and showing only the functionality. There can be only abstract methods in the Java interface,
// not method body

//An interface can also be used to achieve multiple inheritance in Java, which means a class can implement
// more than one interface. An interface can extend another interface, but a class can only extend one class

//interface-interface-->extends
//interface-class----->implements
public interface Animal {
    int count=0;  //all variables are static and final

    //all methods will be abstract
    public void animalSound();
    public void run();
    public void sleep();

}
