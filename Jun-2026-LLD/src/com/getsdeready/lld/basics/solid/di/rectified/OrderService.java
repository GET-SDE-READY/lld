package com.getsdeready.lld.basics.solid.di.rectified;

public class OrderService {
    private final NotificationService notificationService; // loose coupling

    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void placeOrder(String orderId) {
        System.out.println("Placing order for orderId: " + orderId);
        notificationService.send("Order " + orderId + " placed");
    }
}
