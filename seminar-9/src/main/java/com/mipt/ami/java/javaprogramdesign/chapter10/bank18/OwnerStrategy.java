package com.mipt.ami.java.javaprogramdesign.chapter10.bank18;

import java.io.Serializable;

public interface OwnerStrategy extends Serializable {
   boolean isForeign();
   String location();
   int fee();
}
