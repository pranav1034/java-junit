package com.bridgelabz.junit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Assertions.assertEquals(10, Calculator.add(7, 3), "Addition test failed");
        Assertions.assertEquals(-2, Calculator.add(-5, 3), "Addition test failed");
    }

    @Test
    public void testSubtraction() {
        Assertions.assertEquals(4, Calculator.subtract(7, 3), "Subtraction test failed");
        Assertions.assertEquals(-8, Calculator.subtract(-5, 3), "Subtraction test failed");
    }

    @Test
    public void testMultiplication() {
        Assertions.assertEquals(21, Calculator.multiply(7, 3), "Multiplication test failed");
        Assertions.assertEquals(-15, Calculator.multiply(-5, 3), "Multiplication test failed");
    }

    @Test
    public void testDivision() {
        Assertions.assertEquals(2, Calculator.divide(6, 3), "Division test failed");
        Assertions.assertEquals(-2, Calculator.divide(-6, 3), "Division test failed");
    }

    @Test
    public void testDivisionByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> Calculator.divide(5, 0),
                "Expected ArithmeticException when dividing by zero");
    }
}
