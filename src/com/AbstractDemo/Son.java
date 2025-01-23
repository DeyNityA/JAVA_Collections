package com.AbstractDemo;

public class Son extends Parent{

    public Son(){

        System.out.println("Son Constructor");
    }
    @Override
    public void partner(){
        System.out.println("I love John");
    }
}
