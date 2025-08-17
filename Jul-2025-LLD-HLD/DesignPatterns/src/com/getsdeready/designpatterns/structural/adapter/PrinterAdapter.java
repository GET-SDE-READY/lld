package com.getsdeready.designpatterns.structural.adapter;

// Adapter
// Implements the target interface
public class PrinterAdapter implements Printer {

    private final LegacyPrinter legacyPrinter;

    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print() {
        legacyPrinter.printLegacy();
    }
}
