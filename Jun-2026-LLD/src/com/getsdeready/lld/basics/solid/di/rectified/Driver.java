package com.getsdeready.lld.basics.solid.di.rectified;

import com.getsdeready.lld.basics.solid.di.rectified.OrderService;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        NotificationService notificationService =
                new NotificationService(
                        List.of(new EmailService())
                );
        OrderService orderService = new OrderService(notificationService);
        orderService.placeOrder("ABS");
    }
}
