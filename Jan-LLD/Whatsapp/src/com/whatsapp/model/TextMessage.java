package com.whatsapp.model;

import com.whatsapp.model.enums.MessageType;

public class TextMessage extends Message {

    private String content;

    public TextMessage(String messageId,
                       Chat chat,
                       User sender,
                       String content) {
        super(messageId, chat, sender);
        this.content = content;
        this.messageType = MessageType.TEXT;
    }
}
