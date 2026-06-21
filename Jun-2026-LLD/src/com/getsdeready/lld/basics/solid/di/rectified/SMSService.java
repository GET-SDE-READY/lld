package com.getsdeready.lld.basics.solid.di.rectified;

public class SMSService implements NotificationChannel{

    @Override
    public void send(String text) {
        System.out.println("Sending sms with text: " + text);
    }
}
