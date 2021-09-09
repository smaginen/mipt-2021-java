package com.mipt.ami.java.sec02;

import java.math.BigDecimal;

public class NumberDemo {
    public static void main(String[] args) {
        int intVar = 1;
        long longVar = 1L;
        short shortVar = 1;
        byte byteVar = 1;

        float floatVar = 1.0f;
        double doubleVar = 1.0;
        double doubleVar2 = 1.02d;

        char charVar = 'J';
        char charVar2 = 74;

        boolean flag = true;

        Integer integer = 0;
        Long long1 = 1L;

        System.out.println(4000000000L); // long literal
        System.out.println(0xCAFEBABE); // hex literal
        System.out.println(0b1001); // binary literal
        System.out.println(011); // octal literal
        
        // Underscores in literals   
        System.out.println(1_000_000_000); 
        System.out.println(0b1111_0100_0010_0100_0000);
        

        System.out.println(3.14F); // float literal
        System.out.println(3.14); // double literal
        System.out.println(3.14D); // double literal
        System.out.println(0x1.0p-3); // hex double literal

        // Infinity and NaN
        System.out.println(1.0 / 0.0); 
        System.out.println(-1.0 / 0.0);
        System.out.println(0.0 / 0.0);
        
        System.out.println(1.0 / 0.0 == Double.POSITIVE_INFINITY);
        System.out.println(-1.0 / 0.0 == Double.NEGATIVE_INFINITY);
        System.out.println(0.0 / 0.0 == Double.NaN);

        System.out.println(Double.isInfinite(1.0 / 0.0));
        System.out.println(Double.isNaN(0.0 / 0.0));
        System.out.println(Double.isFinite(0.0 / 0.0));
        
        // Roundoff error
        
        System.out.println(2.0 - 1.1);

        
        // Character literals
        
        System.out.println('J'); 
        System.out.println('J' == 74); 
        System.out.println('\u004A'); 
        System.out.println('\u263A');
        System.out.println("Hello"+'\n' + "World");
        System.out.println("Hello"+'\t' + "World");
        System.out.println("Hello"+'\r' + "World");
        System.out.println("Hello"+'\b' + "World");

    }
}