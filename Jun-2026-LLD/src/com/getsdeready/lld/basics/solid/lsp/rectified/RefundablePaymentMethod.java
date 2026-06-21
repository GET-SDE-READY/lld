package com.getsdeready.lld.basics.solid.lsp.rectified;

public interface RefundablePaymentMethod extends PaymentMethod {
    void refund(String transactionId);
}
