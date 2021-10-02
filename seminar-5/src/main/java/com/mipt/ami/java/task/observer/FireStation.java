package com.mipt.ami.java.task.observer;

import java.util.ArrayList;
import java.util.List;

public class FireStation implements FireStationRegister {
    
    private final List<FireObserver> fireObservers = new ArrayList<>();
    
    @Override
    public void registerFireStation(FireObserver fo) {
        

    }
    
    @Override
    public void notifyFireStations(String address) {
                 

    }
    
}
