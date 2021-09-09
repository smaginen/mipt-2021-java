package com.mipt.ami.java.sec03;

import java.util.Random;

public class VariableDemo {
    public static final int DAYS_PER_YEAR = 365;
    
    enum Weekday {
        MON, TUE, WED, THU, FRI, SAT, SUN

    };
    
    public static void main(String[] args) {
        int total = 0;
        int i = 0, count;
        Random generator = new Random();
        double lotsa$ = 1000000000.0; // Legal, but not a good idea
//        double long = 0.0;
        int countOfInvalidInputs = 0; // Example of camelCase
        final int DAYS_PER_WEEK = 7;
        Weekday startDay = Weekday.MON;
//         System.out.println(count);
    }
}
