package com.smagin.ami.java.sec02;


public interface IntSequence {
    default boolean hasNext() { return true; };
//    static IntSequence of() {return new DigitSequence(); }
    int next();
}