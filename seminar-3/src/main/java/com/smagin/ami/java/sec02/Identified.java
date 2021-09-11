package com.smagin.ami.java.sec02;

public interface Identified {
    default int getId() { return Math.abs(hashCode()); } 
}