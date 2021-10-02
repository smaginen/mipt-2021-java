package com.mipt.ami.java;

import com.mipt.ami.java.junit.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionUnitTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {

        assertEquals("addition", 8, calculator.add(5, 3));
    }
}
