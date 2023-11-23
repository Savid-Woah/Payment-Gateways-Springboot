package com.gateways.payment;

import com.gateways.tokenization.TokenizationStrategy;
import com.gateways.transaction.*;

public class WompiPaymentStrategy implements PaymentStrategy {
    @Override
    public TokenizationStrategy getTokenizationStrategy() {
        return null;
    }

    @Override
    public TransactionStrategy getTransactionStrategy(String method) {

        if(method.equals("CARD")){

            return new WompiCardTransactionStrategy();
        }
        else if (method.equals("NEQUI")){

            return new WompiNequiTransactionStrategy();
        }
        else{

            throw new IllegalArgumentException("Unknown transaction method: " + method);
        }
    }
}