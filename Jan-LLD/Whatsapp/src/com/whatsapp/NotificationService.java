package com.whatsapp;

import com.whatsapp.model.Chat;
import com.whatsapp.model.ChatParticipant;
import com.whatsapp.model.Message;
import com.whatsapp.model.User;

public class NotificationService {

    public void notifyChatUsersForMessage(
            Chat chat, Message message) {
        for (ChatParticipant participant: chat.getParticipants()) {

            if (!participant.getUser().equals(message.getSender())) {
                notify(participant.getUser(), message);
            }
        }
    }

    public void notify(User user, Message message) {
        System.out.println("User " + user.getName() + " received message " + message.getMessageId());
    }
}
