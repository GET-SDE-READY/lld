package com.getsdeready.designpatterns.structural.adapter;

public class Driver {

    public static void main(String[] args) {

        Client client = new Client(new PrinterAdapter(new LegacyPrinter()));

        client.doSomething();
    }
}
