package com.devcalc.core.service;

import org.springframework.stereotype.Service;

@Service
public final class CalculatorService {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double sqrt(double x) {
        return Math.sqrt(x);
    }
}
