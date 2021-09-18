package com.smagin.ami.java.sec04;

import com.smagin.ami.java.sec02.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaDemo {
    public static void main(String[] args) {
        String[] friends = { "Peter", "Paul", "Mary" };
        Arrays.sort(friends, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(friends));
        ArrayList<String> enemies = new ArrayList<>(Arrays.asList("Malfoy", "Crabbe", "Goyle", null));
        enemies.removeIf(e -> e == null);
        System.out.println(enemies);

        Runnable runnable = () -> System.out.println("Hello world!");
        Consumer<String> stringConsumer = (String s) -> System.out.println(s);
        Supplier<String>  stringSupplier= () -> "Hello world";
        Function<String, Employee> stringEmployeeFunction =  name -> new Employee(name, 100);
    }
    public static boolean testOnRemove(String s){
        return s == null;
    }
}
