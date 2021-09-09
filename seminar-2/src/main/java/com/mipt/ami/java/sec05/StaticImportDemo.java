package com.mipt.ami.java.sec05;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class StaticImportDemo {
    public static void main(String[] args) {
        double x = 3;
        double y = 4;
        double hypothenuse = sqrt(pow(x, 2) + pow(y, 2)); // i.e., Math.sqrt, Math.pow
        System.out.println(hypothenuse);        
    }
}
