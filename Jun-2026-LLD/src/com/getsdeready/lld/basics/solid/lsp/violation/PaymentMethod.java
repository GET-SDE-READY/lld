package com.getsdeready.lld.basics.solid.lsp.violation;

public interface PaymentMethod {
    void processPayment(double amount);
    void refund(String transactionId);
}
