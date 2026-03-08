package com.whatsapp.model;

import com.whatsapp.model.enums.MessageType;

import java.time.LocalDateTime;

public abstract class Message {

    protected String messageId;
    protected Chat chat;
    protected User sender;
    protected LocalDateTime createdAt;

    protected MessageType messageType;

    public Message(String messageId, Chat chat, User sender) {
        this.messageId = messageId;
        this.chat = chat;
        this.sender = sender;
        this.createdAt = LocalDateTime.now();
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }
}
