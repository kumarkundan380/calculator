package com.calculator.service.impl;

import com.calculator.service.CalculatorService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int addString(String number) {
        int sum = 0;
        String regex = "\\d+";
        if(StringUtils.hasText(number)) {
            String[] numbers = number.split(",");
            for(String str : numbers) {
                str = str.replaceAll("[\\s|\\t|\\r\\n]+",",").trim();
                if(str.matches(regex)){
                    int num = Integer.parseInt(str);
                    if(num < 0 ) {
                        throw new IllegalArgumentException("negative numbers not allowed <"+num+">");
                    }
                    sum += num;
                } else  {
                    throw new IllegalArgumentException("String does not contains digit");
                }
            }

        }
        return sum;
    }
}
