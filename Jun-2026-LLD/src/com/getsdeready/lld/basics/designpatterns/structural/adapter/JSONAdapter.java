package com.getsdeready.lld.basics.designpatterns.structural.adapter;

public class JSONAdapter implements Processor {

    private final LegacyXMLProcessor legacyXMLProcessor;

    public JSONAdapter(LegacyXMLProcessor legacyXMLProcessor) {
        this.legacyXMLProcessor = legacyXMLProcessor;
    }

    @Override
    public void process() {
        System.out.println("Starting processing with JSON");
        legacyXMLProcessor.processXML();
    }

}
