package com.bridgelabz.junit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisionTest {

    @Test
    public void testDivide() {
        assertEquals(3, Division.divide(9, 3));
        assertEquals(-2, Division.divide(-6, 3));
    }

    @Test
    public void testDivisionByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> Calculator.divide(5, 0),
                "Expected ArithmeticException when dividing by zero");
    }
}
