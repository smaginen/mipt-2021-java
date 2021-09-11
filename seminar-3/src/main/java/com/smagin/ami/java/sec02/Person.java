package com.smagin.ami.java.sec02;

public interface Person {
    String getName();
    default int getId() { return 0; }
}