package com.generic_class;

public class Generic_pair<D_type1,D_type2> {
    private D_type1 var1;
    private D_type2 var2;

    public Generic_pair(D_type1 var1,D_type2 var2){
        this.var1=var1;
        this.var2=var2;
    }

    public String show_pair(){
        return  "<"+String.valueOf(this.var1)+","+String.valueOf(this.var2)+">";
    }

}
