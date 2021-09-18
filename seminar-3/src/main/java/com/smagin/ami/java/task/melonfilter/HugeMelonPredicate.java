package com.smagin.ami.java.task.melonfilter;

public class HugeMelonPredicate implements MelonPredicate {

    @Override

    //5000
    public boolean test(Melon melon) {                       
        return true;
    }
    
}
