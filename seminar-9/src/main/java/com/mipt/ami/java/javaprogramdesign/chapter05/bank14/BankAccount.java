package com.mipt.ami.java.javaprogramdesign.chapter05.bank14;

public interface BankAccount extends Comparable<BankAccount> { 
   int getAcctNum();
   int getBalance();   
   void deposit(int amt);
   boolean isForeign();
   void setForeign(boolean isforeign);
   boolean hasEnoughCollateral(int loanamt);
   String toString();
   void addInterest();
   int fee();

   default boolean isEmpty() {
      return getBalance() == 0;
   }

   static BankAccount createSavingsWithDeposit(int acctnum, int n) {
      BankAccount ba = AccountFactories.SAVINGS.create(acctnum);
      ba.deposit(n);
      return ba;
   }
}
