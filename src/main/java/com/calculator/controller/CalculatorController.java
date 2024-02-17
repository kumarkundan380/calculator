package com.calculator.controller;

import com.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/calculator/add")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @RequestMapping
    public ResponseEntity<?> addString(String number) {
        return new ResponseEntity<>(calculatorService.addString(number), HttpStatus.OK);
    }
}
