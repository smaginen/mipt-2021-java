package com.smagin.ami.java.task.melonfilter;

import java.util.ArrayList;
import java.util.List;

public final class Filters {

    private Filters() {
        throw new AssertionError("Cannot be instantiated");
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        return null;
    }

    public static List<Melon> filterMelons(List<Melon> melons, MelonPredicate predicate) {
        return null;
    }

    public static List<Melon> filterByType(List<Melon> melons, String type) {

        return null;
    }

    public static List<Melon> filterByWeight(List<Melon> melons, int weight) {
        return null;
    }

    public static List<Melon> filterByTypeAndWeight(List<Melon> melons, String type, int weight) {
        return null;
    }

}
