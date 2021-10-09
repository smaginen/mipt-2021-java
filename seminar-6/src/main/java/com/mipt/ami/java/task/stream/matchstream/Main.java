package com.mipt.ami.java.task.stream.matchstream;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> melons = Arrays.asList("Gac", "Cantaloupe", "Hemi",
                "Gac", "Gac", "Hemi", "Cantaloupe", "Horned", "Hemi", "Hemi");

        boolean isAnyGac = melons.stream()
                //todo add logic
        System.out.println("is any element matching the string, Gac? " + isAnyGac);

        boolean isAnyApollo = melons.stream()
//todo add logic
        System.out.println("is any element matching the string, Apollo? " + isAnyApollo);

        boolean isNoneGac = melons.stream()
        //todo add logic
        System.out.println("are none elements matching the string, Gac? " + isNoneGac);

        boolean isNoneApollo = melons.stream()
        //todo add logic
        System.out.println("are none elements matching the string, Apollo? " + isNoneApollo);

        boolean areAllGac = melons.stream()
        //todo add logic
        System.out.println("are all elements matching the string, Gac? " + areAllGac);

        boolean areAllLargerThan2 = melons.stream()
        //todo add logic
        System.out.println("are all elements larger than 2? " + areAllLargerThan2);
    }

}
