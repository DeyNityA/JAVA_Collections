package com.polymorphism2;

public class Adv_cal extends Calculator{
    public Adv_cal(){
        System.out.println("Adv_cal constructor");
    }

    @Override
    public int add(int ...numbers) {
        int ans=1;
        for(int no: numbers){
            ans+=no;
        }
        return ans;
    }
}
