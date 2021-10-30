package com.mipt.ami.java.javaprogramdesign.chapter04.bank10.account;

import com.mipt.ami.java.javaprogramdesign.chapter04.bank10.account.CheckingAccount;

public class RegularChecking extends CheckingAccount {

   public RegularChecking(int acctnum) {
      super(acctnum);
   }

   protected String accountType() {
      return "Regular checking";
   }

   protected double interestRate() {
      return 0.0;
   }
}

