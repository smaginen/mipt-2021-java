package com.mipt.ami.java.task.stream.minmaxstream;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Melon> melons = Arrays.asList(new Melon("Gac", 2000),
                new Melon("Hemi", 1600), new Melon("Gac", 3000),
                new Melon("Apollo", 2000), new Melon("Horned", 1700));

        int total1 = melons.stream()
               //todo add logic
                .sum();

        int total2 = melons.stream()
                .//todo add logic;

        System.out.println("The total1 weight is: " + total1);
        System.out.println("The total2 weight is: " + total2);

        int max1 = melons.stream()
        //todo add logic

        int max2 = melons.stream()
        //todo add logic

        System.out.println("Max1: " + max1);
        System.out.println("Max2: " + max2);

        int min1 = melons.stream()
        //todo add logic;

        int min2 = melons.stream()
        //todo add logic

        System.out.println("Min1: " + min1);
        System.out.println("Min2: " + min2);

        List<Double> numbers = Arrays.asList(1.0d, 5.0d, 8.0d, 10.0d);

        double total3 = numbers.stream()                
                .//todo add logic

        System.out.println("Product: " + total3);

        double hm = numbers.size() / numbers.stream()
        //todo add logic

        System.out.println("Harmonic mean: " + hm);
    }

}
