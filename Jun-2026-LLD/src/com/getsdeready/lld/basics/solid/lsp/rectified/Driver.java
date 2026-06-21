package com.getsdeready.lld.basics.solid.lsp.rectified;

import com.getsdeready.lld.basics.solid.lsp.rectified.impl.CreditCardPaymentMethod;
import com.getsdeready.lld.basics.solid.lsp.rectified.impl.GiftCardPaymentMethod;
import com.getsdeready.lld.basics.solid.lsp.rectified.impl.UPIPaymentMethod;

public class Driver {

    public static void main(String[] args) {

        //PaymentMethod method = new UPIPaymentMethod();
        PaymentMethod method = new GiftCardPaymentMethod();
        method.processPayment(20.0);


        RefundablePaymentMethod paymentMethod = new CreditCardPaymentMethod();
        paymentMethod.processPayment(20.0);
        paymentMethod.refund("ABX");
    }
}
