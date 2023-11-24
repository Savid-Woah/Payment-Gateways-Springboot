package com.gateways.transaction;

import com.gateways.request.TransactionRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component("WompiNequiTransactionStrategy")
public class WompiNequiTransactionStrategy implements TransactionStrategy{
    @Override
    public boolean processTransaction(TransactionRequest transactionRequest) {
        // Add your transaction logic here
        System.out.println("Transaction with Wompi - Nequi");
        return true;
    }
}