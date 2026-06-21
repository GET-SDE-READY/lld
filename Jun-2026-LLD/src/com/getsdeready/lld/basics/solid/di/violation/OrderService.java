package com.getsdeready.lld.basics.solid.di.violation;

public class OrderService {
    //private final EmailService emailService;
    private final SMSService smsService;

//    public OrderService(EmailService emailService) {
//        this.emailService = emailService;
//    }
    public OrderService(SMSService smsService) {
        this.smsService = smsService;
    }

    public void placeOrder(String orderId) {
        System.out.println("Placing order for orderId: " + orderId);
        //emailService.send("Order " + orderId + " placed");
        smsService.send("Order " + orderId + " placed");
    }
}
