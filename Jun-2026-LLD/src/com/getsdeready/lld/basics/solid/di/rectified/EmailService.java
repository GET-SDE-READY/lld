package com.getsdeready.lld.basics.solid.di.rectified;

public class EmailService implements NotificationChannel {

    @Override
    public void send(String text) {
        System.out.println("Sending email with text: " + text);
    }
}
