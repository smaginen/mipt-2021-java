package com.mipt.ami.java.task.observer;

public class ViningsFireStation implements FireObserver {

    @Override
    public void fire(String address) {        
        if(address.contains("Vinings")) {
            System.out.println("Vinings fire station will go to this fire");
        }
    }
    
}
