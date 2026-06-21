package com.getsdeready.lld.basics.solid.di.rectified;

import java.util.List;

public class NotificationService {
    private List<NotificationChannel> notificationChannels;

    public NotificationService(List<NotificationChannel> channels) {
        this.notificationChannels = channels;
    }

    public void send(String text) {
        for (NotificationChannel channel: notificationChannels) {
            channel.send(text);
        }
    }
}
