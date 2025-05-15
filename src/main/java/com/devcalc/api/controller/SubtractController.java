package com.devcalc.api.controller;

import com.devcalc.core.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subtract")
@RequiredArgsConstructor
public class SubtractController {
    private final CalculatorService calculatorService;

    @GetMapping
    public ResponseEntity<Double> subtract(
            @RequestParam("a") double a,
            @RequestParam("b") double b
    ) {
        double result = calculatorService.subtract(a, b);
        return ResponseEntity.ok(result);
    }
}
