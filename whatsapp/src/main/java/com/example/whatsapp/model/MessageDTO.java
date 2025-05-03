package com.example.whatsapp.model;

import com.example.whatsapp.enums.ContentType;
import lombok.Data;
import lombok.NonNull;

@Data
public class MessageDTO {

    @NonNull
    private Long senderId;

    @NonNull
    private Long receiverId;

    @NonNull
    private String content;

    private ContentType contentType;
}
