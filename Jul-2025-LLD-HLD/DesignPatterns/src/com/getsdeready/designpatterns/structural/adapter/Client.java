package com.getsdeready.designpatterns.structural.adapter;

// Client
// DO NOT MODIFY
public class Client {

    private final Printer printer;

    public Client(Printer printer) {
        this.printer = printer;
    }

    public void doSomething() {
        printer.print();
    }
}
