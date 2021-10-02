package com.mipt.ami.java.task.observer;

public class Main {

    public static void main(String[] args) {

        FireStation fireStation = new FireStation();
        // fireStation.registerFireStation(new BrookhavenFireStation());
        // fireStation.registerFireStation(new DecaturFireStation());
        // fireStation.registerFireStation(new ViningsFireStation());

//        fireStation.registerFireStation();
//        fireStation.registerFireStation();
//        fireStation.registerFireStation();

        fireStation.notifyFireStations(
                "Fire alert: WestHaven At Vinings 5901 Suffex Green Ln Atlanta");
    }

}
