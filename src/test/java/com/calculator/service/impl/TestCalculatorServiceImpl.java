package com.calculator.service.impl;

import com.calculator.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestCalculatorServiceImpl {

    @InjectMocks
    CalculatorServiceImpl calculatorService;

    @Test
    public void addEmptyStringTest() {
        assertEquals(0, calculatorService.addString(""));
    }

    @Test
    public void addSingleNumberTest() {
        assertEquals(2, calculatorService.addString("2"));
    }

    @Test
    public void addMultipleNumberTest() {
        assertEquals(9, calculatorService.addString("2,3,4"));
    }

    @Test
    public void addMultipleNumberWithNewLineTest() {
        assertEquals(6, calculatorService.addString("1 \"+\" \\n 2,3"));
    }
}
