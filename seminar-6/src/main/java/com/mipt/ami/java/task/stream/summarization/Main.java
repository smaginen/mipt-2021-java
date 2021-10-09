package com.mipt.ami.java.task.stream.summarization;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Melon> melons = Arrays.asList(new Melon("Crenshaw", 2000),
                new Melon("Hemi", 1600), new Melon("Gac", 3000),
                new Melon("Apollo", 2000), new Melon("Horned", 1700),
                new Melon("Gac", 3000), new Melon("Cantaloupe", 2600)
        );

        int sumWeightsGrams = melons.stream()
              //todo add logic

        double sumWeightsKg1 = melons.stream()
        //todo add logic

        double sumWeightsKg2 = melons.stream()
//todo add logic

        double sumWeightsKg3 = melons.stream()
        //todo add logic

        double sumWeightsKg4 = melons.stream()
        //todo add logic

        System.out.println("Sum melons weights in grams: " + sumWeightsGrams + " grams");
        System.out.println("Sum melons weights in kg (v1): " + sumWeightsKg1 + " kg");
        System.out.println("Sum melons weights in kg (v2): " + sumWeightsKg2 + " kg");
        System.out.println("Sum melons weights in kg (v3): " + sumWeightsKg3 + " kg");
        System.out.println("Sum melons weights in kg (v4): " + sumWeightsKg4 + " kg");

        double avgWeights = melons.stream()
        //todo add logic
        System.out.println("\nAvg melons weights: " + avgWeights + " grams");

        long nrOfMelon1 = melons.stream()
        //todo add logic

        long nrOfMelon2 = melons.stream()
        //todo add logic

        long nrOfMelon3 = melons.stream()
        //todo add logic

        System.out.println("\nNumber of melons of 3000g (v1): " + nrOfMelon1);
        System.out.println("Number of melons of 3000g (v2): " + nrOfMelon2);
        System.out.println("Number of melons of 3000g (v3): " + nrOfMelon3);

        Comparator<Melon> byWeight = Comparator.comparing(Melon::getWeight);

        Melon heaviestMelon = melons.stream()
                //todo add logic
                .orElseThrow();

        Melon lightestMelon = melons.stream()
                //todo add logic
                .orElseThrow();

        System.out.println("\nHeaviest melon: " + heaviestMelon);
        System.out.println("Lightest melon: " + lightestMelon);

        IntSummaryStatistics melonWeightsStatistics
                = melons.stream().collect(Collectors.summarizingInt(Melon::getWeight));
        System.out.println("\nMelons weights statistics: " + melonWeightsStatistics);

        System.out.println("Weight of the heaviest melon: " + melonWeightsStatistics.getMax() + " grams");
    }

}
