package com.mipt.ami.java.sec07;

import java.util.*;

public class ForDemo {
   public static void main(String[] args) {
      Random generator = new Random();      
      int count = 20;
      int sum = 0;
      int[] ints = {1, 2};
      for (int anInt : ints) {
         
      }
      for (int i = 1; i <= count; i++) {
         int next = generator.nextInt(10);
         sum = sum + next;
         if(sum >10)continue;
         if(sum < 30) break;
      }
      System.out.println("After " + count 
         + " iterations, the sum is " + sum);
   }
}
