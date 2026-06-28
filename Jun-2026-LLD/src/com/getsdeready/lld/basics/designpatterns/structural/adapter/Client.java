package com.getsdeready.lld.basics.designpatterns.structural.adapter;

// NOT IN OUR CONTROL
public class Client {

    private final Processor processor;

    public Client(Processor processor) {
        this.processor = processor;
    }

    public void process() {
        processor.process();;
    }
}
