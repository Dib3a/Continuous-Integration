package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    void testAddition() {
        assertEquals(5.0, Calculator.calculate(2.0, 3.0, "add"));
    }

    @Test
    void testSubtraction() {
        assertEquals(-1.0, Calculator.calculate(2.0, 3.0, "subtract"));
    }

    @Test
    void testMultiplication() {
        assertEquals(6.0, Calculator.calculate(2.0, 3.0, "multiply"));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, Calculator.calculate(6.0, 3.0, "divide"));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () ->
            Calculator.calculate(6.0, 0.0, "divide")
        );
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }

    @Test
    void testInvalidOperation() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
            Calculator.calculate(2.0, 3.0, "modulus")
        );
        assertEquals("Invalid operation: modulus", exception.getMessage());
    }

    @Test
    void testCaseInsensitiveOperation() {
        assertEquals(5.0, Calculator.calculate(2.0, 3.0, "ADD")); // Uppercase
        assertEquals(5.0, Calculator.calculate(2.0, 3.0, "Add")); // Mixed case
    }

    void testSquareRoot() {

        assertEquals(4.0, Calculator.squareRoot(16), 0.001, " 4");
        assertEquals(2.236, Calculator.squareRoot(5), 0.001, " 2.236");

        assertEquals(0.0, Calculator.squareRoot(0), 0.001, " 0");
    }

}
