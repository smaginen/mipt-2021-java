package com.mipt.ami.java.javaprogramdesign.chapter06.bank15;

public interface OwnerStrategy {
   boolean isForeign();
   String location();
   int fee();
}
