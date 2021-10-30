package com.mipt.ami.java.javaprogramdesign.chapter04.bank10.account;

import com.mipt.ami.java.javaprogramdesign.chapter04.bank10.account.AbstractBankAccount;

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

