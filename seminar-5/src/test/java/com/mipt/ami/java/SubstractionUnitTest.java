package com.mipt.ami.java;

import com.mipt.ami.java.junit.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubstractionUnitTest {
    Calculator calculator = new Calculator();

    @Test
    public void substraction() {
        assertEquals("substraction", 2, calculator.sub(5, 3));
    }
}
