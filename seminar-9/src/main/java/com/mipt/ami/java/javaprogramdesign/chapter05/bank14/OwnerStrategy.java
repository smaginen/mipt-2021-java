package com.mipt.ami.java.javaprogramdesign.chapter05.bank14;

public interface OwnerStrategy {
   boolean isForeign();
   String location();
   int fee();
}
