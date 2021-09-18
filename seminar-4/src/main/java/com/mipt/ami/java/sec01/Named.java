package com.mipt.ami.java.sec01;

public interface Named {
    default String getName() { return ""; }
}