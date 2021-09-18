package com.smagin.ami.java.task.melonfilter;

@FunctionalInterface
public interface Predicate<T> {
    
    boolean test(T t);
}
