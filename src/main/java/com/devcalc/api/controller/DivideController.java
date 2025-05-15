package com.devcalc.api.controller;

import com.devcalc.core.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/divide")
@RequiredArgsConstructor
public class DivideController {
    private final CalculatorService calculatorService;

    @GetMapping
    public ResponseEntity<Double> divide(
            @RequestParam("a") double a,
            @RequestParam("b") double b
    ) {
        double result = calculatorService.divide(a, b);
        return ResponseEntity.ok(result);
    }
}
