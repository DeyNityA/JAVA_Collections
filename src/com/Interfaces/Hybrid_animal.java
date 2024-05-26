package com.Interfaces;

public class Hybrid_animal implements Animal,Bird{


    @Override
    public void animalSound() {
         System.out.println("Fuck fuck");
    }

    @Override
    public void run() {
       System.out.println("run run");
    }

    @Override
    public void fly() {
        System.out.println("fly fly");
    }

    @Override
    public void sleep(){
        System.out.println("ghar ghar");
    }
}
