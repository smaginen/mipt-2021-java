package com.mipt.ami.java.patterns.builder;

public class Client {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount.Builder(1)
                .atBranch("")
                .atRate(1.2)
                .openingBalance(20)
                .withOwner("Fred")
                .build();
    }
}
