package com.gateways.payment;

import com.gateways.tokenization.TokenizationStrategy;
import com.gateways.transaction.PaypalApplePayTransactionStrategy;
import com.gateways.transaction.PaypalCardTransactionStrategy;
import com.gateways.transaction.StrapiZelleTransactionStrategy;
import com.gateways.transaction.TransactionStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component("PaypalPaymentStrategy")
public class PaypalPaymetStrategy implements PaymentStrategy{

    @Override
    public TokenizationStrategy getTokenizationStrategy() {
        return null;
    }

    @Override
    public TransactionStrategy getTransactionStrategy(String method) {

        if(method.equals("CARD")){

            return new PaypalCardTransactionStrategy();
        }
        else if (method.equals("APPLE_PAY")){

            return new PaypalApplePayTransactionStrategy();
        }
        else{

            throw new IllegalArgumentException("Unknown transaction method: " + method);
        }
    }
}
