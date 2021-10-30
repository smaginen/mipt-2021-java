package com.mipt.ami.java.javaprogramdesign.chapter06.bank15;

public class InterestChecking extends CheckingAccount {
   public InterestChecking(int acctnum) {
      super(acctnum);
   }

   protected String accountType() {
      return "Interest checking";
   }

   protected double interestRate() {
      return 0.01;
   }
}

