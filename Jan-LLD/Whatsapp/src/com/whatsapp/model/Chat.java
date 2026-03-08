package com.whatsapp.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Chat {

    protected String chatId;
    protected List<ChatParticipant> participants; // Bi-directional mappings
    protected List<Message> messages;

    public Chat(String id) {
        this.chatId = id;
        this.participants = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    public abstract void addParticipant(User user);
    public abstract void removeParticipant(User user);

    public void addMessage(Message message) {
        this.messages.add(message);
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public List<ChatParticipant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<ChatParticipant> participants) {
        this.participants = participants;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
