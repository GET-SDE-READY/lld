package com.example.whatsapp.controller;

import com.example.whatsapp.model.MessageDTO;
import com.example.whatsapp.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @PostMapping
    public void sendMessage(@RequestBody @Validated MessageDTO messageDTO) {
        chatService.sendMessage(messageDTO);
    }
}
