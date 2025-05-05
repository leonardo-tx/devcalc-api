package com.devcalc.api.controller;

import com.devcalc.core.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/add")
@RequiredArgsConstructor
public class AddController {
    private final CalculatorService calculatorService;

    @GetMapping
    public ResponseEntity<Double> add(
            @RequestParam("a") double a,
            @RequestParam("b") double b
    ) {
        double result = calculatorService.add(a, b);
        return ResponseEntity.ok(result);
    }
}
