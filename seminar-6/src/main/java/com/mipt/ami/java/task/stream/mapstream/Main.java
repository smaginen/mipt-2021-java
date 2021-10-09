package com.mipt.ami.java.task.stream.mapstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Melon> melons = Arrays.asList(new Melon("Gac", 2000),
                new Melon("Hemi", 1600), new Melon("Gac", 3000),
                new Melon("Apollo", 2000), new Melon("Horned", 1700));

        System.out.println("map() examples:");
        List<String> melonNames = melons.stream()
                //todo add logic

                .collect(Collectors.toList());
        System.out.println("\nStream<Melon> to Stream<String> "
                + "and collected in List<Stream>:\n" + melonNames);

        List<Integer> melonWeights = melons.stream()
                //todo add logic
                .collect(Collectors.toList());
        System.out.println("\nStream<Melon> to Stream<Integer> "
                + "and collected in List<Integer>:\n" + melonWeights);

        List<Melon> lighterMelons = melons.stream()
//                       //todo add logic
                .collect(Collectors.toList());
        System.out.println("\nThink twice when use it to mutate state! "
                + "Setting new weights via peek():\n" + lighterMelons);

        System.out.println("\n\nflatMap() examples:");

        Melon[][] melonsArray = {
            {new Melon("Gac", 2000), new Melon("Hemi", 1600)},
            {new Melon("Gac", 2000), new Melon("Apollo", 2000)},
            {new Melon("Horned", 1700), new Melon("Hemi", 1600)}
        };

        Stream<Melon[]> streamOfMelonsArray = Arrays.stream(melonsArray);

        List<Melon> distinctMelons = streamOfMelonsArray
              //todo add logic
                .collect(Collectors.toList());

        System.out.println("Distinct melons: " + distinctMelons);

        List<List<String>> melonLists = Arrays.asList(
                Arrays.asList("Gac", "Cantaloupe"),
                Arrays.asList("Hemi", "Gac", "Apollo"),
                Arrays.asList("Gac", "Hemi", "Cantaloupe"),
                Arrays.asList("Apollo"),
                Arrays.asList("Horned", "Hemi"),
                Arrays.asList("Hemi")
        );

        List<String> distinctNames = melonLists.stream()
                //todo add logic

                .collect(Collectors.toList());

        System.out.println("Distinct names: " + distinctNames);
    }
}
