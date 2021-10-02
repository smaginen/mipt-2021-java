package com.mipt.ami.java.task.executearoundpattern;

import java.io.IOException;
import java.util.Scanner;

@FunctionalInterface
public interface ScannerDoubleFunction {
    
    double readDouble(Scanner scanner) throws IOException;
}
