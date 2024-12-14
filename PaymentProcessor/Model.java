class PaymentService {
    
    Map<PaymentMode, PaymentStrategy> modeToStrategyMap = new HashMap<>();
    
    PaymentService() {
        modeToStrategyMap.put(PaymentMode.NETBANKING, new NetBankingStrategy());
    }
    
    void handlePayment(PaymentRequest paymentRequest) {
        modeToStrategyMap.get(paymentRequest.getPaymentMode()).makePayment(paymentRequest);
    }
}

class PaymentRequest {
    protected Long id;
    protected double amount;
    protected PaymentMode paymentMode;
}

enum PaymentMode {
    NETBANKING,
    UPI,
    DEBIT_CARD
}

class NetBankingPaymentRequest extends PaymentRequest {
    String bankName;
    String netbankingId;
    String netBankingPassword;
}

class UPIPaymentRequest extends PaymentRequest {
    String vpa;
}

class DebitCardPaymentRequest extends PaymentRequest {
    String cardNumber;
    String cvv;
    String expiry;
    String provider;
}

interface PaymentStrategy {
    void makePayment(PaymentRequest paymentRequest);
}

class DebitCardStrategy implements PaymentStrategy {
    
    @Override
    public void makePayment(NetBankingPaymentRequest paymentRequest) {
        // handle netbanking payment
    }
}

class NetBankingStrategy implements PaymentStrategy {
    
    @Override
    public void makePayment(NetBankingPaymentRequest paymentRequest) {
        // handle netbanking payment
    }
}

class UPIPaymentStrategy implements PaymentStrategy {
    
    @Override
    public void makePayment(UPIPaymentRequest paymentRequest) {
        // handle UPI payment
    }
}



