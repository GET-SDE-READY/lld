package com.example.whatsapp.service;

import com.example.whatsapp.model.Message;
import com.example.whatsapp.model.MessageDTO;
import com.example.whatsapp.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    @Autowired
    private ChatRepository chatRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private NotificationService notificationService;

    public void sendMessage(MessageDTO messageDTO) {
        Message message = new Message();
        message.setSenderId(messageDTO.getSenderId());
        message.setReceiverId(messageDTO.getReceiverId());
        message.setContent(messageDTO.getContent());
        message.setContentType(messageDTO.getContentType());

        chatRepository.save(message);

        if (userService.isConnected(message.getReceiverId()))
            notificationService.notifyUser(message.getReceiverId(), message.getContent());
    }
}
