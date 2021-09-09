package com.mipt.ami.java.sec01;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MethodDemo {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello, World!".length());
        System.out.println(new Random().nextInt());
        Random generator = null;
        System.out.println(generator.nextInt());
        System.out.println(generator.nextInt());

        sortSentence("is2 sentence4 This1 a3");
    }

    public static String sortSentence(String s) {
        String[] s1 = s.split(" ");
        Map<String,String> res = new HashMap<>();
        for (int i = 0; i < s1.length; i++) {
            res.put(String.valueOf(s1[i].charAt(s1[i].length() -1)),
                    s1[i].substring(0, s1[i].length() - 1));
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s1.length; i++) {
            builder.append(res.get(i)).append(" ");
        }
        return builder.substring(0,builder.length()-1);
    }
}