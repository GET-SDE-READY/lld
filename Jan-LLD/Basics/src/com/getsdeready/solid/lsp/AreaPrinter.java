package com.getsdeready.solid.lsp;

import com.getsdeready.solid.lsp.calculator.SumCalculator;

public class AreaPrinter {

    private SumCalculator calculator;

    public AreaPrinter(SumCalculator calculator) {
        this.calculator = calculator;
    }

    public void printArea() {
        System.out.println("Sum : " + this.calculator.sum());
    }
}
