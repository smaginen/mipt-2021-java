package com.smagin.ami.java.sec07;

public class ScopeDemo {
    public static void main(String[] args) {
        repeatMessage("Hello", 10);

        //compile fail
//        for (int i = 0; i < 10 ; i++) {
//            new Thread(() -> System.out.println(i));
//        }
        //effective final
        for (String a : args)
            new Thread(() -> System.out.println(a));
    }
    //блок кода, параметры, значения свободных переменных -  переменные экземпляра
    public static void repeatMessage(String text, int count) {
        Runnable r = () -> {
           for (int i = 0; i < count; i++) {
              System.out.println(text);
           }
        };
        new Thread(r).start();                  
     }
     //compile fail
//    public static void repeatMessage1(String text, int count) {
//        Runnable r = () -> {
//            while (count >0) {
//                count--;
//                System.out.println(text);
//            }
//        };
//        new Thread(r).start();
//    }

}
