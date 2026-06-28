package com.getsdeready.lld.basics.designpatterns.structural.adapter;

public class Driver {

    public static void main(String[] args) {
        Client jsonClient = new Client(new JSONAdapter(new LegacyXMLProcessor()));
        Client csvClient = new Client(new CSVAdapter(new LegacyXMLProcessor()));

        jsonClient.process();
        csvClient.process();
    }
}
