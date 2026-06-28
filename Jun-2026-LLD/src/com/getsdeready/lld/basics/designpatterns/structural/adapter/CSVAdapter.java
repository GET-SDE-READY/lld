package com.getsdeready.lld.basics.designpatterns.structural.adapter;

public class CSVAdapter implements Processor {

    private final LegacyXMLProcessor legacyXMLProcessor;

    public CSVAdapter(LegacyXMLProcessor legacyXMLProcessor) {
        this.legacyXMLProcessor = legacyXMLProcessor;
    }

    @Override
    public void process() {
        System.out.println("Starting processing with CSV");
        legacyXMLProcessor.processXML();
    }
}
