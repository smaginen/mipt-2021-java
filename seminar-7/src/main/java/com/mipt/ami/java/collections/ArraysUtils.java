package com.mipt.ami.java.collections;


import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraysUtils {
    public static void main(String... args) {
        equalsDemo();
        arrayUtils();
        String s = "X++";
        String s1 = "++X";
        int i = s.indexOf("++");
        int i1 = s1.indexOf("++");
        System.out.println(i + " and " + i1);
        minOperations(new String[]{"d1/", "d2/", "../", "d21/", "./"});
    }

    public String truncateSentence(String s, int k) {
        String[] split = s.split("\\s+");
        return IntStream.range(0, k).mapToObj(i -> split[i]).collect(Collectors.joining(" "));
    }

    public static int minOperations(String[] logs) {
        Integer res = 0;
        for (String log : logs) {
           res =  mapToFunction(log, res);
        }
        return res;

    }
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Long> collect = s.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Set<Long> collect1 = collect.entrySet().stream().map(e -> e.getValue()).collect(Collectors.toSet());
        return collect1.size() == 1;
    }

        private static Integer mapToFunction(String s, Integer res) {
            if (s.equals("../")) {
                return   Math.max(--res, 0);

            }
            if (s.equals("./")) {
                return  res;
            }
            return ++res;
        }

    public String reversePrefix(String word, char ch) {
        StringBuilder append = new StringBuilder(
                word.substring(0, word.indexOf(ch) + 1))
                .reverse().append(word.substring(word.indexOf(ch)));
        return append.toString();
    }

    public int finalValueAfterOperations(String[] operations) {
        Function<Integer, Integer> reduce = Arrays.stream(operations).map(this::toFunction).reduce(Function.identity(), Function::andThen);
        return reduce.apply(0);
    }

    private Function<Integer, Integer> toFunction(String s) {
        if (s.indexOf("++") == 0 || s.indexOf("++") == 1) return i -> i + 1;
        if (s.indexOf("--") == 0 || s.indexOf("--") == 1) return i -> i + 1;
        return Function.identity();
    }

    private static void equalsDemo() {
        System.out.println("\nequalsDemo():");

        String[] arr1 = {"s1", "s2"};
        String[] arr2 = {"s1", "s2"};
        System.out.println(arr1.equals(arr2));             //prints: false
        System.out.println(Arrays.equals(arr1, arr2));     //prints: true
        System.out.println(Arrays.deepEquals(arr1, arr2)); //prints: true

        String[][] arr3 = {{"s1", "s2"}};
        String[][] arr4 = {{"s1", "s2"}};
        System.out.println(arr3.equals(arr4));             //prints: false
        System.out.println(Arrays.equals(arr3, arr4));     //prints: false
        System.out.println(Arrays.deepEquals(arr3, arr4)); //prints: true

        Integer[][] ar1 = {{42}};
        Integer[][] ar2 = {{42}};
        System.out.print(Arrays.equals(ar1, ar2) + " ");   //prints: false
        System.out.println(Arrays.deepEquals(arr3, arr4)); //prints: true

    }

    public boolean areNumbersAscending(String s) {
        String[] split = s.split("\\s+");
        List<Integer> collect = Arrays.stream(split).filter(i -> isNumber(i)).map(i -> Integer.parseInt(i))
                .collect(Collectors.toList());
        if (collect.size() <= 1) {
            return true;
        }
        for (int i = 0; i < collect.size() - 1; i++) {
            if (collect.get(i) > collect.get(i + 1)) return false;
        }
        return true;
    }


    private boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static void arrayUtils() {
        System.out.println("\narrayUtils():");

        String[] arr1 = {"s1", "s2"};
        String[] arr2 = {null};
        String[] arr3 = null;
        System.out.print(ArrayUtils.getLength(arr1) + " "); //prints: 2
        System.out.print(ArrayUtils.getLength(arr2) + " "); //prints: 1
        System.out.print(ArrayUtils.getLength(arr3) + " "); //prints: 0
        System.out.print(ArrayUtils.isEmpty(arr2) + " ");   //prints: false
        System.out.print(ArrayUtils.isEmpty(arr3));         //prints: true

    }


}
