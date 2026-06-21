package com.getsdeready.lld.basics.solid.lsp.rectified.impl;

import com.getsdeready.lld.basics.solid.lsp.rectified.PaymentMethod;

public class UPIPaymentMethod implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment for amount : " + amount);
    }
}
