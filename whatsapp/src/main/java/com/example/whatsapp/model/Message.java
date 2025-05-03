package com.example.whatsapp.model;

import com.example.whatsapp.enums.ContentType;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
@Data
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long messageId;
    private Long senderId;
    private Long receiverId;
    private String content;
    private ContentType contentType;

    @CreatedDate
    private LocalDateTime createdOn;
}
