package com.mipt.ami.java.sec04.impl;

import ch04.sec04.Cipher;

public class AESCipherFactory {
    public static Cipher provider() { return new AESCipher(); }
}
