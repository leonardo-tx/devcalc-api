package com.devcalc.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {"com.devcalc"})
@EntityScan(basePackages = "com.devcalc.core.entity")
public class DevCalcApplication {
    public static void main(String[] args) {
        SpringApplication.run(DevCalcApplication.class, args);
    }
}
