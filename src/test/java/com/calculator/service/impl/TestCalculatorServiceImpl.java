package com.calculator.service.impl;

import com.calculator.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestCalculatorServiceImpl {

    @InjectMocks
    CalculatorService calculatorService;

    @Test
    public void addEmptyStringTest() {
        when(calculatorService.addString("")).thenReturn(0);
    }

    @Test
    public void addSingleNumberTest() {
        when(calculatorService.addString("2")).thenReturn(2);
    }

    @Test
    public void addMultipleNumberTest() {
        when(calculatorService.addString("2,3,4")).thenReturn(9);
    }

    @Test
    public void addMultipleNumberWithNewLineTest() {
        when(calculatorService.addString("1 "+" \n 2,3")).thenReturn(6);
    }
}
