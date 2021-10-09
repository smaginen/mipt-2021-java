package com.mipt.ami.java.task.stream.collectresultofstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Melon> melons = Arrays.asList(new Melon("Crenshaw", 2000),
                new Melon("Hemi", 1600), new Melon("Gac", 3000),
                new Melon("Apollo", 2000), new Melon("Horned", 1700),
                new Melon("Gac", 3000), new Melon("Cantaloupe", 2600)
        );

        List<Integer> resultToList1 = melons.stream()
//            todo add logic

        List<Integer> resultToList2 = melons.stream()
//            todo add logic
        System.out.println("\nCollect via toList():\n" + resultToList1);
        System.out.println("\nCollect via toCollection to ArrayList:\n" + resultToList2);

        Set<Integer> resultToSet1 = melons.stream()
//            todo add logic

        Set<Integer> resultToSet2 = melons.stream()
//            todo add logic
        
        Set<Integer> resultToSet3 = melons.stream()
//            todo add logic
        
        System.out.println("\nCollect via toSet():\n" + resultToSet1);
        System.out.println("\nCollect via toCollection() to HashSet:\n" + resultToSet2);
        System.out.println("\nCollect via toCollection() to TreeSet:\n" + resultToSet3);

        Map<String, Integer> resultToMap1 = melons.stream()
//            todo add logic

        Map<Integer, Integer> resultToMap2 = melons.stream()
//            todo add logic

        Map<String, Integer> resultToMap3 = melons.stream()
//            todo add logic

        Map<String, Integer> resultToMap4 = melons.stream()
                .sorted(Comparator.comparingInt(Melon::getWeight))
        //            todo add logic

        System.out.println("\nCollect via toMap():\n" + resultToMap1);
        System.out.println("\nCollect via toMap() with random keys:\n" + resultToMap2);
        System.out.println("\nCollect via toMap() with old key in case of collision:\n" + resultToMap3);
        System.out.println("\nCollect via toMap() sorted:\n" + resultToMap4);
    }

}
