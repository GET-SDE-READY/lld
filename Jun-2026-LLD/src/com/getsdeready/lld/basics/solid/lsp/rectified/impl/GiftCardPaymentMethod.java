package com.getsdeready.lld.basics.solid.lsp.rectified.impl;

import com.getsdeready.lld.basics.solid.lsp.rectified.PaymentMethod;

public class GiftCardPaymentMethod implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Gift card payment of amount: " + amount);
    }
}
