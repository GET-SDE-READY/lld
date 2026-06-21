package com.getsdeready.lld.basics.solid.lsp.violation;

import com.getsdeready.lld.basics.solid.lsp.violation.impl.UPIPaymentMethod;

public class Driver {

    public static void main(String[] args) {
        //PaymentMethod paymentMethod = new CreditCardPaymentMethod();
        PaymentMethod paymentMethod = new UPIPaymentMethod();

        paymentMethod.processPayment(20.0);
        paymentMethod.refund("ABC123");
    }
}
