package com.gateways.transaction;

import com.gateways.request.TransactionRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component("PapalApplePayTransactionStrategy")
public class PaypalApplePayTransactionStrategy implements TransactionStrategy{
    @Override
    public boolean processTransaction(TransactionRequest transactionRequest) {
        // Add your transaction logic here
        System.out.print("Transaction with Paypal - Apple Pay");
        return true;
    }
}