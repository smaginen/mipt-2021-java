package com.mipt.ami.java.javaprogramdesign.chapter04.bank10.account;

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

   static BankAccount createSavingsWithDeposit(int acctnum, int n) {
      BankAccount ba = new SavingsAccount(acctnum);
      ba.deposit(n);
      return ba;
   }

   default boolean isEmpty() {
      return getBalance() == 0;
   }
}