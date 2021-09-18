package com.smagin.ami.java.sec05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        String[] strings = { "Mary", "had", "a", "little", "lamb" };
        Arrays.sort(strings, (s1, s2) -> s1.compareToIgnoreCase(s2));
        //класс::метод экземляра
        Arrays.sort(strings, String::compareToIgnoreCase);


        System.out.println(Arrays.toString(strings));
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Malfoy", "Crabbe", "Goyle", null));

        for (String s : list) {
            if(s == null){
                list.remove(s);
            }
        }
        list.removeIf(obj -> isNull(obj));
        list.removeIf(obj -> Objects.isNull(obj));
        list.removeIf(Objects::isNull);
        //класс::статический метод
        list.removeIf(Objects::isNull);
        //объект::метод экземляра
        list.forEach(System.out::println);
    }
    public static <T> boolean isNull(T obj){
        return  obj == null;
    }
}
