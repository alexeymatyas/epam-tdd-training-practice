package com.epam.tdd;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        System.out.println(CalculatorService.divide(BigDecimal.TEN, BigDecimal.ONE));
    }
}
