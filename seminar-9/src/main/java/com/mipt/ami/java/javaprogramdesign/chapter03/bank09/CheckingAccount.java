package com.mipt.ami.java.javaprogramdesign.chapter03.bank09;

public abstract class CheckingAccount extends AbstractBankAccount {

   protected CheckingAccount(int acctnum) {
      super(acctnum);
   }

   protected double collateralRatio() {
      return 2.0 / 3.0;
   }

   protected abstract String accountType();
   protected abstract double interestRate();
}

