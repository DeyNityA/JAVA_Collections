package com.polymorphism;

public class Rectangle extends Shapes{
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        super();
        this.a = a;
        this.b = b;
        System.out.println("rectangle constructor");
    }
    @Override
    public void Area(){
        System.out.println("Area of Rectangle is "+(a*b));
    }

    public static void show(){
        System.out.println("static method from Rectangle");
    }
}
