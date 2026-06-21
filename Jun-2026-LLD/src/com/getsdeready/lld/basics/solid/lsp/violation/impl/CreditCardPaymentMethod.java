package com.getsdeready.lld.basics.solid.lsp.violation.impl;

import com.getsdeready.lld.basics.solid.lsp.violation.PaymentMethod;

public class CreditCardPaymentMethod implements PaymentMethod {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment for amount : " + amount);
    }

    @Override
    public void refund(String transactionId) {
        System.out.println("Refunding credit card payment for transaction: " + transactionId);
    }
}
