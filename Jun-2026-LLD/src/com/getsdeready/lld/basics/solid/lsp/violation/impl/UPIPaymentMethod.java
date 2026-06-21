package com.getsdeready.lld.basics.solid.lsp.violation.impl;

import com.getsdeready.lld.basics.solid.lsp.violation.PaymentMethod;

public class UPIPaymentMethod implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment for amount : " + amount);
    }

    @Override
    public void refund(String transactionId) {
        throw new UnsupportedOperationException("Refunds not supported for UPI");
    }
}
