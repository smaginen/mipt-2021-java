package com.mipt.ami.java.javaprogramdesign.chapter04.bank10.cmd;

import com.mipt.ami.java.javaprogramdesign.chapter04.bank10.Bank;

import java.util.Scanner;

public class SelectCmd implements InputCommand {
   public int execute(Scanner sc, Bank bank, int current) {
      System.out.print("Enter account#: ");
      current = sc.nextInt();
      int balance = bank.getBalance(current);
      System.out.println("The balance of account " + current + " is " + balance);
      return current;
   }

   public String toString() {
      return "select";
   }
}

