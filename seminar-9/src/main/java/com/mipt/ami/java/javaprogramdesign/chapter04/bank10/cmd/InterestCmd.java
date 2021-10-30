package com.mipt.ami.java.javaprogramdesign.chapter04.bank10.cmd;

import com.mipt.ami.java.javaprogramdesign.chapter04.bank10.Bank;

import java.util.Scanner;

public class InterestCmd implements InputCommand {
   public int execute(Scanner sc, Bank bank, int current) {
      bank.addInterest();     
      return current;
   }

   public String toString() {
      return "interest";
   }
}

