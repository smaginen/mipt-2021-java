package com.mipt.ami.java.javaprogramdesign.chapter08.bank17;

import java.util.*;

public class BankProgram {
   public static void main(String[] args) {
      SavedBankInfo info = new SavedBankInfo("bank17.info");
      Map<Integer,BankAccount> accounts = info.getAccounts();
      int nextacct = info.nextAcctNum();
      Bank bank = new Bank(accounts, nextacct);
      Scanner scanner = new Scanner(System.in);
      BankClient client = new BankClient(scanner, bank);
      client.run();
      info.saveMap(accounts, bank.nextAcctNum());
   }
}

