package com.whatsapp.model;

import com.whatsapp.model.enums.ParticipantRole;

import java.util.Objects;

public class GroupChat extends Chat {

    private String groupName;
    private User admin;

    public GroupChat(String chatId, String groupName, User admin) {
        super(chatId);
        this.groupName = groupName;
        this.admin = admin;

        participants.add(new ChatParticipant("3", admin, this,
                ParticipantRole.ADMIN));
    }
    @Override
    public void addParticipant(User user) {
        participants.add(
                new ChatParticipant(
                        user.getUserId(),
                        user,
                        this,
                        ParticipantRole.MEMBER
                )
        );
    }

    @Override
    public void removeParticipant(User user) {

        // Option 1
        participants.removeIf(p ->
                p.getUser().equals(user));

        // Option 2
//        ChatParticipant participantToBeRemoved = null;
//        for (ChatParticipant participant : participants) {
//            if (participant.getUser().equals(user)) {
//                participantToBeRemoved = participant;
//                break;
//            }
//        }
//
//        if (Objects.nonNull(participantToBeRemoved)) {
//            participants.remove(participantToBeRemoved);
//        }
    }
}
