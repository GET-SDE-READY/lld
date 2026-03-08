package com.whatsapp.model;

import com.whatsapp.model.enums.ReceiptStatus;

import java.time.LocalDateTime;

public class MessageReceipt {

    private String receiptId;
    private Message message;
    private User user;
    private ReceiptStatus receiptStatus;
    private LocalDateTime timestamp;


    public MessageReceipt(
            String receiptId,
            Message message,
            User user) {
        this.receiptId = receiptId;
        this.message = message;
        this.user = user;
        this.receiptStatus = ReceiptStatus.SENT;
        this.timestamp = LocalDateTime.now();
    }

    public void markDelivered() {
        this.receiptStatus = ReceiptStatus.DELIVERED;
    }

    public void markRead() {
        this.receiptStatus = ReceiptStatus.READ;
    }
}
