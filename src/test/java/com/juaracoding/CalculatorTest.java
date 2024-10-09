package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int actual = calculator.add(10, 5);
        int expected = 15;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSubtract() {
        int actual = calculator.subtract(10, 5);
        int expected = 5;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testMultiply() {
        int actual = calculator.multiply(10, 5);
        int expected = 50;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testDivide() {
        int actual = calculator.divide(10, 5);
        int expected = 2;
        Assert.assertEquals(actual, expected);
    }
}
