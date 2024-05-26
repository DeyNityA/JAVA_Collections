package com.generic_method;

public class G_m {
    public <D_T> void show(D_T ...arr){

        for(D_T e: arr){
           System.out.println(e);
        }
    }

    //bounded generic type
    public <D_T extends Number> void show2(D_T ...arr){

        for(D_T e: arr){
            System.out.println(e);
        }

    }
}
