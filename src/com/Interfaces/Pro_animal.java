package com.Interfaces;

public interface Pro_animal extends Animal{
    void jump();

    @Override
    default void show(){
     System.out.println("Chaa mudao");
    }

}
