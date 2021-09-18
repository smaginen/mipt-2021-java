package com.smagin.ami.java.task.remover;

public class Main {

    public static void main(String[] args) {

        String text = "This is a text from 20 April 2050";

        String noNrClassic = Remover.remove(text, new NumberRemover());
        System.out.println("No numbers result (classic): " + noNrClassic);

        String noWsClassic = Remover.remove(text, new WhitespacesRemover());
        System.out.println("No whitespaces result (classic): " + noWsClassic);
        //use lambda
        String noNr = Remover.remove(text, s -> "");
        System.out.println("\nNo numbers result (lambda): " + noNr);
        //use lambda
        String noWs = Remover.remove(text, s -> "");
        System.out.println("No whitespaces result (lambda): " + noWs);
    }

}
