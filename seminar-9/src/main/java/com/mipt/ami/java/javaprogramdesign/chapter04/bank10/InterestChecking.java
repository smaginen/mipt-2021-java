package com.mipt.ami.java.javaprogramdesign.chapter04.bank10;

import com.mipt.ami.java.javaprogramdesign.chapter04.bank10.account.CheckingAccount;

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

