package com.gateways.payment;

import com.gateways.tokenization.TokenizationStrategy;
import com.gateways.transaction.TransactionStrategy;

public interface PaymentStrategy {
    TokenizationStrategy getTokenizationStrategy();
    TransactionStrategy getTransactionStrategy(String method);
}