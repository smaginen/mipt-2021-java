package com.mipt.ami.java.javaprogramdesign.chapter06.bank15;

public class MaxBalanceVisitor implements Visitor<BankAccount,Integer> {
   private int max = 0;

   public void accept(BankAccount ba) {
      int bal = ba.getBalance();
      if (bal > max)
         max = bal;
   }

   public Integer result() {
      return max;
   }
}
