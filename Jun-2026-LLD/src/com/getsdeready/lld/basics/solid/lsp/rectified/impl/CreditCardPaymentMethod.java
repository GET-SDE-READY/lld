package com.getsdeready.lld.basics.solid.lsp.rectified.impl;

import com.getsdeready.lld.basics.solid.lsp.rectified.RefundablePaymentMethod;

public class CreditCardPaymentMethod implements RefundablePaymentMethod {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment for amount : " + amount);
    }

    @Override
    public void refund(String transactionId) {
        System.out.println("Refunding credit card payment for transaction: " + transactionId);
    }
}
