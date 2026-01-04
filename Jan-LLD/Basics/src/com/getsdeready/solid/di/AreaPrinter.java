package com.getsdeready.solid.di;

import com.getsdeready.solid.lsp.calculator.AreaCalculator;
import com.getsdeready.solid.lsp.calculator.SumCalculator;

// High level module
public class AreaPrinter {

    // low level module
    //private AreaCalculator calculator;

    // abstraction
    private SumCalculator calculator;

    public AreaPrinter(SumCalculator calculator) {
        this.calculator = calculator;
    }

    public void printArea() {
        System.out.println("Sum : " + this.calculator.sum());
    }
}
