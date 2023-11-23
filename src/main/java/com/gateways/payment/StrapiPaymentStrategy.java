package com.gateways.payment;

import com.gateways.tokenization.TokenizationStrategy;
import com.gateways.transaction.StrapiCardTransactionStrategy;
import com.gateways.transaction.StrapiZelleTransactionStrategy;
import com.gateways.transaction.TransactionStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component("StrapiPaymentStrategy")
public class StrapiPaymentStrategy implements PaymentStrategy {
    @Override
    public TokenizationStrategy getTokenizationStrategy() {
        return null;
    }

    @Override
    public TransactionStrategy getTransactionStrategy(String method) {

        if(method.equals("CARD")){

            return new StrapiCardTransactionStrategy();
        }
        else if (method.equals("ZELLE")){

            return new StrapiZelleTransactionStrategy();
        }
        else{

            throw new IllegalArgumentException("Unknown transaction method: " + method);
        }
    }
}
