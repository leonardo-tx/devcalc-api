package com.devcalc.core.service;

import net.jqwik.api.Example;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.lifecycle.BeforeExample;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {
    private CalculatorService calculatorService;

    @BeforeExample
    void setupBeforeEachExample() {
        calculatorService = new CalculatorService();
    }

    @Example
    public void test10AddedBy5Equals15() {
        assertEquals(15, calculatorService.add(10, 5));
    }

    @Example
    public void test10SubtractedBy5Equals5() {
        assertEquals(5, calculatorService.subtract(10, 5));
    }

    @Example
    public void test10MultipliedBy5Equals50() {
        assertEquals(50, calculatorService.multiply(10, 5));
    }

    @Example
    public void test10DividedBy5Equals2() {
        assertEquals(2, calculatorService.divide(10, 5));
    }

    @Example
    public void testSquareRoot16() {
        assertEquals(4, calculatorService.sqrt(16));
    }

    @Property
    public void addRandomInputs(@ForAll double a, @ForAll double b) {
        assertEquals(a + b, calculatorService.add(a, b));
    }

    @Property
    public void subtractRandomInputs(@ForAll double a, @ForAll double b) {
        assertEquals(a - b, calculatorService.subtract(a, b));
    }

    @Property
    public void multiplyRandomInputs(@ForAll double a, @ForAll double b) {
        assertEquals(a * b, calculatorService.multiply(a, b));
    }

    @Property
    public void divideRandomInputs(@ForAll double a, @ForAll double b) {
        assertEquals(a / b, calculatorService.divide(a, b));
    }

    @Property
    public void squareRootRandomInputs(@ForAll double x) {
        assertEquals(Math.sqrt(x), calculatorService.sqrt(x));
    }
}
