package com.smagin.ami.java.task.sort;

import java.time.Clock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {

    private static final int ARRAY_SIZE = 10_000;
    private static final String[] MELON_TYPES
            = {"Watermelon", "Cantaloupe", "Horned", "Crenshaw", "Honeydew",
                "Gac", "Bitter", "Winter", "Sprite", "Korean", "Canary", "Charentais",
                "Bailan", "Hami", "Santa Claus", "Sky Rocket", "Golden Langkawi", "Apollo",
                "Honey Globe", "Autumn Sweet", "Jade Dew", "Golden Prize", "Ten Me", "New Century"};

    public static void main(String[] args) {

        Clock clock = Clock.systemUTC();
        Random rnd = new Random();
        Comparator<Melon> byType = Comparator.comparing(Melon::getType);

        // initialize an array integers        
        int[] integers = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            integers[i] = rnd.nextInt(ARRAY_SIZE);
        }

        // initialize an array of Melons
        Melon[] melons = new Melon[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            melons[i] = new Melon(MELON_TYPES[rnd.nextInt(5)], 2000 + rnd.nextInt(2000000));
        }

        System.out.println("Sort via Arrays.sort()");
        System.out.println("----------------------");

        System.out.println("\nArrays.sort(): sorting 'integers', array size: " + integers.length);
        int[] cloneIntegers = integers.clone();
        long startTimeV1 = clock.millis();
        Arrays.sort(cloneIntegers);
        displayExecutionTime(clock.millis() - startTimeV1);
        displayIntSortedArray(cloneIntegers);

        System.out.println("\nArrays.sort(): sorting 'melons', array size: " + melons.length);
        Melon[] cloneMelons = melons.clone();
        long startTimeV2 = clock.millis();
        //insert comparator
        //Arrays.sort(cloneMelons, //});
        displayExecutionTime(clock.millis() - startTimeV2);
        displayMelonsSortedArray(cloneMelons);



    }

    private static void displayExecutionTime(long time) {
        System.out.println("Execution time: " + time + " ms" + " ("
                + TimeUnit.SECONDS.convert(time, TimeUnit.MILLISECONDS) + " s)");
    }

    // dummy display method
    private static void displayIntSortedArray(int[] arr) {

        for (int i = 0; i < 30; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print(" ...\n");
    }

    // dummy display method
    private static void displayMelonsSortedArray(Melon[] arr) {

        for (int i = 0; i < 30; i++) {
            System.out.print(arr[i] + " ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }

        System.out.print(" ...\n");
    }
}
