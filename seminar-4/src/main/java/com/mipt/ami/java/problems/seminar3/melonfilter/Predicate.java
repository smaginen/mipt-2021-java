package com.mipt.ami.java.problems.seminar3.melonfilter;

@FunctionalInterface
public interface Predicate<T> {
    
    boolean test(T t);
}
