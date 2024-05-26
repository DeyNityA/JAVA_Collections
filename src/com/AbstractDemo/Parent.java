package com.AbstractDemo;

public abstract class Parent {

    public Parent() {
        System.out.println("Parent Constructor");
    }


    public abstract void partner();
    //every abstract method should override in subclass
    public static void method2() {
        System.out.println("Parent method2");
    }
}
