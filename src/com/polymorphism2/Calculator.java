package com.polymorphism2;

public class Calculator {
    public Calculator() {
        System.out.println("Calculator constructor");
    }


    public int add(int ...numbers) {
        int ans=0;
        for(int no: numbers){
            ans+=no;
        }
        return ans;
    }

}
