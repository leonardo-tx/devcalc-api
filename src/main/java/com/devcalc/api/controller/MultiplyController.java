package com.devcalc.api.controller;

import com.devcalc.core.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/multiply")
@RequiredArgsConstructor
public class MultiplyController {
    private final CalculatorService calculatorService;

    @GetMapping
    public ResponseEntity<Double> multiply(
            @RequestParam("a") double a,
            @RequestParam("b") double b
    ) {
        double result = calculatorService.multiply(a, b);
        return ResponseEntity.ok(result);
    }
}
