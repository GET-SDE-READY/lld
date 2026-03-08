package com.whatsapp.model;

import com.whatsapp.model.enums.MediaType;
import com.whatsapp.model.enums.MessageType;

public class MediaMessage extends Message {

    private MediaType mediaType;
    private String mediaUrl;
    private String description;

    public MediaMessage(String messageId,
                        Chat chat,
                        User sender,
                        MediaType mediaType,
                        String mediaUrl) {
        super(messageId, chat, sender);
        this.mediaType = mediaType;
        this.mediaUrl = mediaUrl;
        this.messageType = MessageType.MEDIA;
    }
}
