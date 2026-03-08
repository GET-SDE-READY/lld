package com.whatsapp.services;

import com.whatsapp.model.DirectChat;
import com.whatsapp.model.GroupChat;
import com.whatsapp.model.User;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ChatService {

    private static final AtomicInteger UUID = new AtomicInteger(0);

    public DirectChat createDirectChat(User u1, User u2) {

        return new DirectChat(
                String.valueOf(UUID.getAndIncrement()),
                u1,
                u2);
    }

    public GroupChat createGroupChat(User admin,
                                     String name,
                                     List<User> users) {
        GroupChat chat = new GroupChat(
                String.valueOf(UUID.getAndIncrement()),
                name,
                admin
        );

        for (User user: users) {

            if (!user.equals(admin)) {
                chat.addParticipant(user);
            }
        }

        return chat;
    }
}
