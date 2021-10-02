package com.mipt.ami.java.task.observer;

@FunctionalInterface
public interface FireObserver {

    void fire(String address);
}
