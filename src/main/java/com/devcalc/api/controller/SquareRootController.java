package com.devcalc.api.controller;

import com.devcalc.core.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sqrt")
@RequiredArgsConstructor
public class SquareRootController {
    private final CalculatorService calculatorService;

    @GetMapping
    public ResponseEntity<Double> sqrt(
            @RequestParam("x") double x
    ) {
        double result = calculatorService.sqrt(x);
        return ResponseEntity.ok(result);
    }
}
