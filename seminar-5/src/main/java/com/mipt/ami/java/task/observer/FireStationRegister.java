package com.mipt.ami.java.task.observer;

public interface FireStationRegister {
    
    void registerFireStation(FireObserver fo);
    void notifyFireStations(String address);    
}
