package com.mipt.ami.java.javaprogramdesign.chapter04.bank10.cmd;

import com.mipt.ami.java.javaprogramdesign.chapter04.bank10.Bank;

import java.util.Scanner;

public interface InputCommand {
   int execute(Scanner sc, Bank bank, int current);
}
