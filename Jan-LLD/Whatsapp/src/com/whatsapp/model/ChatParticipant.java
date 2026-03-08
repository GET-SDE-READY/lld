package com.whatsapp.model;

import com.whatsapp.model.enums.ParticipantRole;

import java.time.LocalDateTime;


// User (M)---->(M) Chat
// User (1)---->(M) ChatParticipant
// Chat (1)---->(M) ChatParticipant

public class ChatParticipant {

    private String id;

    private User user; // Bi-directional mappings
    private Chat chat; // Bi-directional mappings

    private ParticipantRole role;
    private LocalDateTime joinedAt;

    private String lastReadMessageId;

    public ChatParticipant(String id, User user, Chat chat, ParticipantRole role) {
        this.id = id;
        this.user = user;
        this.chat = chat;
        this.role = role;
        this.joinedAt = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public ParticipantRole getRole() {
        return role;
    }

    public void setRole(ParticipantRole role) {
        this.role = role;
    }

    public LocalDateTime getJoinedAt() {
        return joinedAt;
    }

    public void setJoinedAt(LocalDateTime joinedAt) {
        this.joinedAt = joinedAt;
    }

    public String getLastReadMessageId() {
        return lastReadMessageId;
    }

    public void setLastReadMessageId(String lastReadMessageId) {
        this.lastReadMessageId = lastReadMessageId;
    }
}
