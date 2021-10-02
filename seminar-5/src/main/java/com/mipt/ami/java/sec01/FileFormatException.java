package com.mipt.ami.java.sec01;

import java.io.IOException;

public class FileFormatException extends IOException {
    public FileFormatException() {}
    public FileFormatException(String message) {
        super(message);
    }

}