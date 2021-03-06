package com.mipt.ami.java.javaprogramdesign.chapter10.bank18;

public class CollateralAuthorizer implements LoanAuthorizer {
   private BankAccount ba;

   public CollateralAuthorizer(BankAccount ba) {
      this.ba = ba;
   }

   public boolean authorizeLoan(int amt) {
      return ba.hasEnoughCollateral(amt);
   }
}
