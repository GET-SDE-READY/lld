package com.whatsapp.model;

import com.whatsapp.model.enums.ParticipantRole;

public class DirectChat extends Chat {

    public DirectChat(String chatId, User user1, User user2) {
        super(chatId);

        participants.add(
                new ChatParticipant("1",
                        user1, this,
                        ParticipantRole.MEMBER));
        participants.add(
                new ChatParticipant("2",
                        user2, this,
                        ParticipantRole.MEMBER));
    }

    @Override
    public void addParticipant(User user) {
        throw new UnsupportedOperationException(
                "Direct Chat does not allow addition of new users");
    }

    @Override
    public void removeParticipant(User user) {
        throw new UnsupportedOperationException(
                "Direct Chat does not allow removal of users");
    }
}
