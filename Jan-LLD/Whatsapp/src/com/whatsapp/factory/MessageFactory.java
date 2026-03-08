package com.whatsapp.factory;

import com.whatsapp.model.*;
import com.whatsapp.model.enums.MediaType;
import com.whatsapp.model.enums.MessageType;

public class MessageFactory {

    // Option 1 (Wrap all variables in same method)
    public static Message createMessage(
            MessageType type,
            String messageId,
            Chat chat,
            User sender,
            String content,
            MediaType mediaType,
            String url) {
        switch (type){
            case TEXT -> {
                return new TextMessage(
                        messageId, chat, sender, content
                );
            }
            case MEDIA -> {
                return new MediaMessage(
                        messageId, chat, sender,
                        mediaType, url
                );
            }
        }
        return null;
    }



    // Option 2: Create separate static methods for text
    // and media message. In this case, MessageFactory will
    // serve as a utility class
}
