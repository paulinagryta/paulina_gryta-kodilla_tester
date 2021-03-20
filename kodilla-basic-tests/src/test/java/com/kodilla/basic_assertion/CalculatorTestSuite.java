package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test

    public void testSum() {
        Calculator calculatorSum = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculatorSum.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubstract() {
        int c = 5;
        int d = 5;
        Calculator calculatorSub = new Calculator();
        int subtractResult = calculatorSub.subtract(c, d);
        assertEquals(0, subtractResult);
    }


    @Test
    public void testsquaredA() {
        int a = 6;
        Calculator calculatorSqA = new Calculator();
        int squaredAResult = calculatorSqA.squaredA(a);
        assertEquals(36, squaredAResult);
    }
    @Test
    public void testsquaredAminus() {
        int a = -6;
        Calculator calculatorSqAminus = new Calculator();
        int squaredAResult = calculatorSqAminus.squaredA(a);
        assertEquals(36, squaredAResult);
    }
}




