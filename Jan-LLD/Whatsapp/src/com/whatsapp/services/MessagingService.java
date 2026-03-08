package com.whatsapp.services;

import com.whatsapp.NotificationService;
import com.whatsapp.model.Chat;
import com.whatsapp.model.ChatParticipant;
import com.whatsapp.model.Message;
import com.whatsapp.model.MessageReceipt;

import java.util.ArrayList;
import java.util.List;

public class MessagingService {

    private final NotificationService notificationService;

    public MessagingService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public Message sendMessage(Chat chat, Message message) {

        chat.addMessage(message);

        List<MessageReceipt> receipts = generateReceipts(chat, message);

        notificationService.notifyChatUsersForMessage(chat, message);

        updateReceiptsToDelivered(receipts);

        return message;
    }

    private void updateReceiptsToDelivered(List<MessageReceipt> receipts) {

        for (MessageReceipt receipt: receipts) {
            receipt.markDelivered();
        }
    }

    private List<MessageReceipt> generateReceipts(Chat chat, Message message) {
        List<MessageReceipt> receipts = new ArrayList<>();

        for (ChatParticipant participant : chat.getParticipants()) {
            if (!participant.getUser().equals(message.getSender())) {

                receipts.add(
                        new MessageReceipt(
                                String.join("_", message.getMessageId(),
                                        participant.getUser().getUserId()),
                                message,
                                participant.getUser()
                        )
                );
            }
        }

        return receipts;
    }
}
